package com.xtool.query.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xtool.query.po.CarCustom;
import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserQueryVo;
import com.xtool.query.service.CarService;
import com.xtool.query.service.UserService;

@Controller
@RequestMapping("/user")
public class UserCarController {
	private int pageSice = 5;
	
	@Autowired
	private UserService userService;
	@Autowired
	private CarService carService;
	
//	@RequestMapping("/findUserCar")
//	public String findUserCar(Model model,UserQueryVo userQueryVo) throws Exception {
//		
//		List<UserCustom> userList = userService.findUserList(userQueryVo);
//		if(userList != null) {
//			for(UserCustom userCustom : userList) {
//				Integer uid = userCustom.getUid();
//				CarCustom carCustom = carService.findCarByCuid(uid);
//				if(carCustom != null) {
//					userCustom.setCustom(carCustom);
//				}
//			}
//			model.addAttribute("userCar", userList);
//			return "/usercar_tables";
//		}else {
//			return "";
//		}
//	}
	
	@RequestMapping("/findUserCar")
	public String findUserCar(HttpServletRequest request ,Model model,UserQueryVo userQueryVo) throws Exception {
		Integer count = userService.findUserCountByUname(userQueryVo);
		
		String uname = null;
		StringBuffer url = new StringBuffer();
		if(userQueryVo.getCustom() != null) {
			uname = userQueryVo.getCustom().getUname();
		}
		if(userQueryVo.getPc() == null) {
			userQueryVo.setPc(1);
		}
		PageBean<UserCustom> pageBean = new PageBean<UserCustom>();
		pageBean.setPs(pageSice);
		pageBean.setTr(count);
		pageBean.setPc(userQueryVo.getPc());
		url.append(request.getRequestURI()+"?0=0");
		if(uname != null) {
			url.append("&custom.uname=" + uname);
		}
		pageBean.setUrl(url.toString());
		pageBean.setCustom(userQueryVo.getCustom());
		List<UserCustom> userList = userService.findUserListByUnamePage(pageBean);
		if(userList != null) {
			for(UserCustom userCustom : userList) {
				List<CarCustom> carList = carService.findCarByCuid(userCustom.getUid());
				if(carList != null) {
					userCustom.setCustom(carList);
				}
			}
			model.addAttribute("userCar", userList);
			model.addAttribute("pb", pageBean);
			return "/usercar_tables";
		}else {
			return "";
		}
	}
	
	@RequestMapping("/editUserCar")
	public String editUserCar(Model model,
			@RequestParam("uid") Integer id,
			@RequestParam("index") Integer index) throws Exception {
		UserCustom userCustom = userService.findUserById(id);
		List<CarCustom> carList = carService.findCarByCuid(id);
		if(carList != null) {
			userCustom.setCustom(carList);
		}
		model.addAttribute("index", index);
		model.addAttribute("userCustom", userCustom);
		return "/usercar_edit";
	}
	
	@RequestMapping("/editUserCarSubmit")
	public String editUserCarSubmit(@RequestParam("uid") Integer id,
			UserCustom userCustom) throws Exception {
		userService.updateUser(id, userCustom);
		List<CarCustom> carList = userCustom.getCustom();
		for(CarCustom carCustom : carList) {
			Integer cid = carCustom.getCid();
			carService.updateCar(cid, carCustom);
		}
		return "redirect:findUserCar.action";
	}
	
	@RequestMapping("/deleteUserCar")
	public String deleteUserCar(@RequestParam("uid") Integer id) throws Exception {
		userService.deleteUser(id);
		return "redirect:findUserCar.action";
	}
	
	@RequestMapping("/deleteUserCarList")
	public String deleteUserCarList(int[] user_id) throws Exception {
		for(int i = 0; i < user_id.length; i++) {
			userService.deleteUser(user_id[i]);
		}
		return "redirect:findUserCar.action";
	}
	
	@RequestMapping("/insertUserCar")
	public String insertUserCar() throws Exception {
		
		return "/usercar_insert";
	}
	
	@RequestMapping("/insertUserCarSubmit")
	public String insertUserCarSubmit(Model model,UserCustom userCustom) throws Exception {
		UserCustom custom = userService.findUserByUname(userCustom.getUname());
		if(custom == null) {
			userService.insertUser(userCustom);
		}
		List<CarCustom> carList = userCustom.getCustom();
		for(CarCustom carCustom : carList) {
			if(!carCustom.getCname().equals("")) {
				UserCustom userCustom2 = userService.findUserByUname(userCustom.getUname());
				carCustom.setCuid(userCustom2.getUid());
				carService.insertCar(carCustom);
			}
		}
		return "redirect:findUserCar.action";
	}
	
}
