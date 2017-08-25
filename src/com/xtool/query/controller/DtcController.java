package com.xtool.query.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtool.query.exception.CustomException;
import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.PageBean;
import com.xtool.query.service.DtcService;

@Controller
@RequestMapping("/dtc")
public class DtcController {
	private int pageSice = 5;

	@Autowired
	private DtcService service;
	
	@RequestMapping("/queryDtc")
	public String queryDtc(Model model) throws Exception {
		List<DtcCustom> dtcList = service.findDtcList(null);
		model.addAttribute("dtcList", dtcList);
		
		return "/dtc_tables";
	}
	
//	@RequestMapping("/queryDtcByPage")
//	public String queryDtcByPage(HttpServletRequest request ,Model model,DtcQueryVo dtcQueryVo) throws Exception {
//		
//		Integer count = service.findDtcCount();
//		if(dtcQueryVo.getPc() == null) {
//			dtcQueryVo.setPc(1);
//		}
//		PageBean<DtcCustom> pageBean = new PageBean<DtcCustom>();
//		pageBean.setPs(pageSice);
//		pageBean.setTr(count);
//		pageBean.setPc(dtcQueryVo.getPc());
//		pageBean.setUrl(request.getRequestURI()+"?0=0");
//		List<DtcCustom> list = service.findDtcListByPage(pageBean);
//		model.addAttribute("dtcList", list);
//		model.addAttribute("pb", pageBean);
//		
//		return "/dtc_tables";
//	}
	
	@RequestMapping("/queryDtcByDcodePage")
	public String queryDtcByDcodePage(HttpServletRequest request ,Model model,DtcQueryVo dtcQueryVo) throws Exception {
		Integer count = service.findDtcCountByDcode(dtcQueryVo);
		String dcode = null;
		StringBuffer url = new StringBuffer();
		if(dtcQueryVo.getCustom() != null) {
			dcode = dtcQueryVo.getCustom().getDcode();
		}
		if(dtcQueryVo.getPc() == null) {
			dtcQueryVo.setPc(1);
		}
		PageBean<DtcCustom> pageBean = new PageBean<DtcCustom>();
		pageBean.setPs(pageSice);
		pageBean.setTr(count);
		pageBean.setPc(dtcQueryVo.getPc());
		url.append(request.getRequestURI()+"?0=0");
		if(dcode != null) {
			url.append("&custom.dcode=" + dcode);
		}
		pageBean.setUrl(url.toString());
		pageBean.setCustom(dtcQueryVo.getCustom());
		List<DtcCustom> list = service.findDtcListByPage(pageBean);
		model.addAttribute("dtcList", list);
		model.addAttribute("pb", pageBean);
		
		return "/dtc_tables";
	}
	
	
	@RequestMapping("/editDtc")
	public String editDtc(Model model, @RequestParam("did") Integer id) throws Exception {
		DtcCustom dtcCustom = service.findDtcById(id);
		if(dtcCustom == null) {
			throw new CustomException("故障码信息不存在!");
		}
		model.addAttribute("dtcCustom", dtcCustom);
		
		return "/dtc_edit";
	}
	
	@RequestMapping("/editDtcSubmit")
	public String editDtcSubmit(@RequestParam("did") Integer id, DtcCustom dtcCustom) throws Exception {
		service.updateDtc(id, dtcCustom);
		return "redirect:queryDtcByDcodePage.action";
	}
	
	@RequestMapping("/deleteDtc")
	public String deleteDtc(@RequestParam("did") Integer id) throws Exception {
		service.deleteDtc(id);
		return "redirect:queryDtcByDcodePage.action";
	}
	
	@RequestMapping("/deleteDtcList")
	public String deleteDtcList(int[] dtc_id) throws Exception {
		for(int i =0;i < dtc_id.length; i++) {
			service.deleteDtc(dtc_id[i]);
		}
		return "redirect:queryDtcByDcodePage.action";
	}
	
	@RequestMapping("/insertDtc")
	public String insertDtc() throws Exception {
		
		return "/dtc_insert";
	}
	
	@RequestMapping("/insertDtcSubmit")
	public String insertDtcSubmit(DtcCustom dtcCustom) throws Exception {
		service.insertDtc(dtcCustom);
		return "redirect:queryDtcByDcodePage.action";
	}
	


	
}
