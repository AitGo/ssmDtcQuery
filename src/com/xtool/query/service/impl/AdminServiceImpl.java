package com.xtool.query.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xtool.query.exception.CustomException;
import com.xtool.query.mapper.AdminMapperCustom;
import com.xtool.query.po.AdminCustom;
import com.xtool.query.po.AdminQueryVo;
import com.xtool.query.service.AdminService;

public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapperCustom custom;

	@Override
	public AdminCustom findAdmin(AdminQueryVo adminQueryVo) throws Exception {
		AdminCustom admin = custom.findAdmin(adminQueryVo);
		if(admin==null) {
			throw new CustomException("用户名密码错误！");
		}
		return admin;
	}

}
