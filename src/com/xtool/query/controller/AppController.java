package com.xtool.query.controller;

import java.security.interfaces.RSAPrivateKey;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.service.DtcService;
import com.xtool.query.utils.AESUtil;
import com.xtool.query.utils.RSAUtils;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	private DtcService dtcService;
	
	@RequestMapping("/queryDtcByDcode")
	public @ResponseBody List<DtcCustom> queryDtcByDcode(HttpServletRequest request) throws Exception {
		List<DtcCustom> dtcList = dtcService.findDtcList(null);
		System.out.println(dtcList.toString());
		System.out.println("11111111");
		System.out.println(request.getAttribute("dcode"));
		return dtcList;
	}
	
	@RequestMapping("/queryDtcByDcodeJson")
	public @ResponseBody List<DtcCustom> queryDtcByDcodeJson(@RequestBody DtcCustom dtcCusotm) throws Exception {
		RSAPrivateKey privateKey = RSAUtils.getPrivateKeyFile();
		 String aesKey = RSAUtils.decryptByPrivateKey(dtcCusotm.getKey(),privateKey);
		 String dcode = AESUtil.decrypt(dtcCusotm.getDcode(), aesKey);
		 dtcCusotm.setDcode(dcode);
		 DtcQueryVo dtcQueryVo = new DtcQueryVo();
		 dtcQueryVo.setCustom(dtcCusotm);
		List<DtcCustom> dtcList = dtcService.findDtcList(dtcQueryVo);
		System.out.println(dtcList.toString());
		System.out.println("2222222222");
		return dtcList;
	}
}
