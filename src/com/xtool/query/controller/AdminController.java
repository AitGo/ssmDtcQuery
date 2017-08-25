package com.xtool.query.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xtool.query.po.AdminQueryVo;
import com.xtool.query.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService service;
	
	@RequestMapping("/login")
	public String login() {
		
		return "/login";
	}
	
	@RequestMapping("/loginSubmit")
	public String loginSubmit(Model model,
			HttpSession session,
			@Validated AdminQueryVo adminQueryVo,
			BindingResult bindingResult) throws Exception {
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError error : allErrors) {
				System.out.println(error.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "/login";
		}
		service.findAdmin(adminQueryVo);
		session.setAttribute("admin", adminQueryVo.getAdminCustom().getAname());
		return "redirect:index.action";
	}
	
	@RequestMapping("/index")
	public String index() throws Exception {
		
		return "/index";
	}

}
