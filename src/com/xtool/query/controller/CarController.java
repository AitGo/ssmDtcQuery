package com.xtool.query.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xtool.query.po.CarCustom;
import com.xtool.query.po.CarQueryVo;
import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.service.CarService;
import com.xtool.query.service.UserService;

@Controller
@RequestMapping("/car")
public class CarController {
	private int pageSice = 2;
	@Autowired
	private CarService service;
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/queryCarByUserPage")
	public String queryCarByUserPage(HttpServletRequest request,Model model,CarQueryVo carQueryVo) throws Exception {
		Integer count = service.findCarCountByCname(carQueryVo);
		String uname = null;
		StringBuffer url = new StringBuffer();
		if(carQueryVo.getCustom() != null) {
			uname = carQueryVo.getCustom().getCname();
		}
		if(carQueryVo.getPc() == null) {
			carQueryVo.setPc(1);
		}
		PageBean<CarCustom> pageBean = new PageBean<CarCustom>();
		pageBean.setPs(pageSice);
		pageBean.setTr(count);
		pageBean.setPc(carQueryVo.getPc());
		url.append(request.getRequestURI()+"?0=0");
		if(uname != null) {
			url.append("&custom.uname=" + uname);
		}
		pageBean.setUrl(url.toString());
		pageBean.setCustom(carQueryVo.getCustom());
		List<CarCustom> list = service.findCarListByCnamePage(pageBean);
		model.addAttribute("userCar", list);
		model.addAttribute("pb", pageBean);
		return "/car_tables";
	}
	
	@RequestMapping("/deleteCar")
	public String deleteCar(@RequestParam("cid") Integer id) throws Exception {
		service.deleteCar(id);
		return "redirect:queryCarByUserPage.action";
	}
	
	@RequestMapping("/editCar")
	public String editCar(Model model,@RequestParam("cid") Integer id) throws Exception {
		CarCustom carCustom = service.findCarById(id);
		Integer cuid = carCustom.getCuid();
		UserCustom userCustom = userService.findUserById(cuid);
		carCustom.setUserCustom(userCustom);
		model.addAttribute("carCustom", carCustom);
		return "/car_edit";
	}
	
	@RequestMapping("/editCarSubmit")
	public String editCarSubmit(Model model,@RequestParam("cid") Integer id,CarCustom carCustom) throws Exception {
		String uname = carCustom.getUserCustom().getUname();
		UserCustom userCustom = userService.findUserByUname(uname);
		if(userCustom == null) {
			model.addAttribute("carCustom", carCustom);
			model.addAttribute("error", "没有该用户！");
			return "/car_edit";
		}else {
			carCustom.setCuid(userCustom.getUid());
			service.updateCar(id, carCustom);
			return "redirect:queryCarByUserPage.action";
		}
		    
		
	}
	
	@RequestMapping("/insertCar")
	public String insertCar() throws Exception {
		
		return "/car_insert";
	}
	
	@RequestMapping("/insertCarSubmit")
	public String insertCarSubmit(Model model,CarCustom carCustom) throws Exception {
		
		UserCustom userCustom = carCustom.getUserCustom();
		UserCustom user = userService.findUserByUname(userCustom.getUname());
		if(user == null) {
			model.addAttribute("error", "没有该用户！");
			return "/car_insert";
		}else {
			carCustom.setCuid(user.getUid());
			service.insertCar(carCustom);
			return "redirect:queryCarByUserPage.action";
		}
	}
	
	@RequestMapping("/deleteCarList")
	public String deleteCarList(int[] car_id) throws Exception {
		for(int i = 0; i < car_id.length; i++) {
			service.deleteCar(car_id[i]);
		}
		return "redirect:queryCarByUserPage.action";
	}
}
