package com.xtool.query.controller;

import java.util.List;

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
import com.xtool.query.po.Message;
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
	public @ResponseBody Message<List<DtcDTO>> queryDtcByDcodeJson(@RequestBody DtcCustom dtcCustom) throws Exception {
		Message<List<DtcDTO>> message = new Message<List<DtcDTO>>();
		String sAesKey = null;
		String dcode = null;
		message.setCode(0);
		message.setMsg("");
		try {
			sAesKey = RSAUtils.decryptByPrivateKey(privateKeyPath, dtcCustom.getKey());
			CodingUtils.DeCoding(dtcCustom, sAesKey);
//			dcode = AESUtil.decrypt(dtcCustom.getDcode(), sAesKey);
			dcode = dtcCustom.getDcode();
			dtcCustom.setDcode(dcode);
			DtcQueryVo dtcQueryVo = new DtcQueryVo();
			dtcQueryVo.setCustom(dtcCustom);
			dtcQueryVo.setS(dtcCustom.getS());
			dtcQueryVo.setPs(dtcCustom.getPs());
			List<DtcDTO> dtcList = dtcService.findDtcDTOList(dtcQueryVo);
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
	public @ResponseBody Message<List<UserDTO>> userLogin(@RequestBody UserCustom userCustom) {
		Message<List<UserDTO>> message = new  Message<List<UserDTO>>();
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
}
