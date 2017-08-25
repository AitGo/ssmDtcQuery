package com.xtool.query.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserQueryVo;
import com.xtool.query.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private int pageSice = 2;
	@Autowired
	private UserService service;
	
	@RequestMapping("/queryUser")
	public String queryUser(Model model,UserQueryVo userQueryVo) throws Exception {
		List<UserCustom> findUserList = service.findUserList(userQueryVo);
		model.addAttribute("userList", findUserList);
		return "/user_tables";
	}
	
	@RequestMapping("/queryUserByUnamePage")
	public String queryUserByUnamePage(HttpServletRequest request ,Model model,UserQueryVo userQueryVo) throws Exception {
		Integer count = service.findUserCountByUname(userQueryVo);
		
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
		List<UserCustom> list = service.findUserListByUnamePage(pageBean);
		model.addAttribute("userList", list);
		model.addAttribute("pb", pageBean);
		return "/user_tables";
		
	}
	
	@RequestMapping("/editUser")
	public String editUser(Model model, @RequestParam("uid") Integer id) throws Exception {
		UserCustom userCustom = service.findUserById(id);
		model.addAttribute("userCustom", userCustom);
		return "/user_edit";
	}
	
	@RequestMapping("/editUserSubmit")
	public String editUserSubmit(@RequestParam("uid") Integer id,UserCustom userCustom) throws Exception {
		service.updateUser(id, userCustom);
		return "redirect:queryUserByUnamePage.action";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("uid") Integer id) throws Exception {
		service.deleteUser(id);
		return "redirect:queryUserByUnamePage.action";
	}
	
	@RequestMapping("/insertUser")
	public String insertUser() throws Exception {
		return "/user_insert";
	}
	
	@RequestMapping("/insertUserSubmit")
	public String insertUserSubmit(Model model,UserCustom userCustom) throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		userQueryVo.setCustom(userCustom);
		List<UserCustom> findUserList = service.findUserList(userQueryVo);
		if(findUserList.size() > 0) {
//			throw new CustomException("用户已存在！");
			model.addAttribute("error", "用户已存在！");
			return "/user_insert";
		}else {
			service.insertUser(userCustom);
			return "redirect:queryUserByUnamePage.action";
		}
	}
	
	@RequestMapping("/deleteUserList")
	public String deleteUserList(int[] user_id) throws Exception {
		for(int i = 0; i < user_id.length; i++) {
			service.deleteUser(user_id[i]);
		}
		return "redirect:queryUserByUnamePage.action";
	}

}
