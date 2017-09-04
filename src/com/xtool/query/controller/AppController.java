package com.xtool.query.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.Message;
import com.xtool.query.service.DtcService;
import com.xtool.query.utils.CodingUtils;
import com.xtool.query.utils.RSAUtils;
import com.xtool.query.utils.RandomUtils;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	private DtcService dtcService;
	private String privateKeyPath = "D:\\file\\privateKey.cer"; 
	private String publicKeyPath = "D:\\file\\publicKey.cer"; 
	
	@RequestMapping("/queryDtcByDcode")
	public @ResponseBody List<DtcCustom> queryDtcByDcode(HttpServletRequest request) throws Exception {
		List<DtcCustom> dtcList = dtcService.findDtcList(null);
		System.out.println(dtcList.toString());
		System.out.println("11111111");
		System.out.println(request.getAttribute("dcode"));
		return dtcList;
	}
	
	@RequestMapping("/queryDtcByDcodeJson")
	public @ResponseBody Message<List<DtcCustom>> queryDtcByDcodeJson(@RequestBody DtcCustom dtcCustom) throws Exception {
		Message<List<DtcCustom>> message = new Message<List<DtcCustom>>();
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
			List<DtcCustom> dtcList = dtcService.findDtcList(dtcQueryVo);
			String uuid = RandomUtils.getRandomValue(16);
			for(DtcCustom dtc : dtcList) {
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
}
