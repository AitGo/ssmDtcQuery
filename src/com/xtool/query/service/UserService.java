package com.xtool.query.service;

import java.util.List;

import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserQueryVo;

public interface UserService {

	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	public List<UserCustom> findUserListByUnamePage(PageBean<UserCustom> pageBean) throws Exception;
	
	public Integer findUserCountByUname(UserQueryVo userQueryVo) throws Exception;
	
	public UserCustom findUserById(Integer id) throws Exception;
	
	public void updateUser(Integer id , UserCustom userCustom) throws Exception;
	
	public void deleteUser(Integer id) throws Exception;
	
	public void insertUser(UserCustom userCustom) throws Exception;
	
	public UserCustom findUserByUname(String uname) throws Exception;
}
