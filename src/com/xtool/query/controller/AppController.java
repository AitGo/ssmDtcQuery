package com.xtool.query.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtool.query.po.CarCustom;
import com.xtool.query.po.CarDTO;
import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcDTO;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.MessageDTO;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserDTO;
import com.xtool.query.po.UserQueryVo;
import com.xtool.query.service.DtcService;
import com.xtool.query.service.UserService;
import com.xtool.query.utils.CodingUtils;
import com.xtool.query.utils.RSAUtils;
import com.xtool.query.utils.RandomUtils;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	private DtcService dtcService;
	@Autowired
	private UserService userService;
	private String privateKeyPath = "D:\\file\\privateKey.cer"; 
	private String publicKeyPath = "D:\\file\\publicKey.cer"; 
	
	@RequestMapping("/queryDtcByDcodeJson")
	public @ResponseBody MessageDTO<List<DtcDTO>> queryDtcByDcodeJson(@RequestBody DtcCustom dtcCustom) throws Exception {
		MessageDTO<List<DtcDTO>> message = new MessageDTO<List<DtcDTO>>();
		String sAesKey = null;
		String dcode = null;
		message.setCode(0);
		message.setMsg("");
		try {
			sAesKey = RSAUtils.decryptByPrivateKey(privateKeyPath, dtcCustom.getKey());
			CodingUtils.DeCoding(dtcCustom, sAesKey);
			dcode = dtcCustom.getDcode();
			dtcCustom.setDcode(dcode);
			DtcQueryVo dtcQueryVo = new DtcQueryVo();
			dtcQueryVo.setCustom(dtcCustom);
			dtcQueryVo.setS(dtcCustom.getS());
			dtcQueryVo.setPs(dtcCustom.getPs());
			List<DtcDTO> dtcList = dtcService.findDtcListByQuery(dtcQueryVo);
			String uuid = RandomUtils.getRandomValue(16);
			for(DtcDTO dtc : dtcList) {
				dtc.setKey(uuid);
				CodingUtils.encodingByPrivateKey(dtc,uuid);
			}
			message.setData(dtcList);
		}catch (Exception e) {
			message.setCode(101);
			message.setMsg("密钥错误");
		}
		return message;
	}
	
	@RequestMapping("/userLogin")
	public @ResponseBody MessageDTO<List<UserDTO>> userLogin(@RequestBody UserCustom userCustom) {
		MessageDTO<List<UserDTO>> message = new  MessageDTO<List<UserDTO>>();
		message.setCode(0);
		message.setMsg("");
		String sAesKey = null;
		try {
			sAesKey = RSAUtils.decryptByPrivateKey(privateKeyPath, userCustom.getKey());
			CodingUtils.DeCoding(userCustom, sAesKey);
			UserQueryVo userQueryVo = new UserQueryVo();
			userQueryVo.setCustom(userCustom);
			List<UserDTO> userList = userService.findUserDTOListByUnamePage(userQueryVo);
			if(userList.size() != 1) {
				message.setCode(201);
				message.setMsg("用户名错误！");
			}else {
				//设置登录状态
				userService.updateUserByUname(userCustom);
				String uuid = RandomUtils.getRandomValue(16);
				for(UserDTO user : userList) {
					CarDTO carDTO = user.getCarDTO();
					if(carDTO != null) {
						carDTO.setKey(uuid);
						CodingUtils.encodingByPrivateKey(carDTO,uuid);
						user.setCarDTO(carDTO);
					}
					user.setKey(uuid);
					CodingUtils.encodingByPrivateKey(user,uuid);
				}
				message.setCode(0);
				message.setMsg("");
				message.setData(userList);
			}
			
		}catch (Exception e) {
			message.setCode(101);
			message.setMsg("密钥错误");
		}
		return message;
	}
	
	
	
	@RequestMapping("/upasswordUpdate")
	public @ResponseBody MessageDTO<List<UserDTO>> upasswordUpdate(@RequestBody UserCustom userCustom) {
		MessageDTO<List<UserDTO>> message = new  MessageDTO<List<UserDTO>>();
		
		message.setCode(0);
		message.setMsg("");
		String sAesKey = null;
		UserDTO userDTO;
		try {
			sAesKey = RSAUtils.decryptByPrivateKey(privateKeyPath, userCustom.getKey());
			CodingUtils.DeCoding(userCustom, sAesKey);
			UserCustom user = userService.findUserByUname(userCustom.getUname());
			userService.updateUser(user.getUid(), userCustom);
			UserCustom custom = userService.findUserById(user.getUid());
			userDTO = new UserDTO();
			BeanUtils.copyProperties(custom, userDTO);
			String uuid = RandomUtils.getRandomValue(16);
			userDTO.setKey(uuid);
			CodingUtils.encodingByPrivateKey(userDTO, uuid);
			List<UserDTO> list = new ArrayList<UserDTO>();
			list.add(userDTO);
			message.setData(list);
		}catch (Exception e) {
			message.setCode(101);
			message.setMsg("密钥错误");
		}
		
		return message;
	}
	
	
	@RequestMapping("/userinfoUpdate")
	public @ResponseBody MessageDTO<List<UserDTO>> userinfoUpdate(@RequestBody UserCustom userCustom) {
		MessageDTO<List<UserDTO>> message = new MessageDTO<List<UserDTO>>();
		message.setCode(0);
		message.setMsg("");
		String sAesKey = null;
		try {
			sAesKey = RSAUtils.decryptByPrivateKey(privateKeyPath, userCustom.getKey());
			CodingUtils.DeCoding(userCustom, sAesKey);
			
		} catch (Exception e) {
			
		}
		
		return null;
	}
}
