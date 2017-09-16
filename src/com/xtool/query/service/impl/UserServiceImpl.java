package com.xtool.query.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtool.query.exception.CustomException;
import com.xtool.query.mapper.UserMapper;
import com.xtool.query.mapper.UserMapperCustom;
import com.xtool.query.po.CarCustom;
import com.xtool.query.po.PageBean;
import com.xtool.query.po.User;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserDTO;
import com.xtool.query.po.UserQueryVo;
import com.xtool.query.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapperCustom mapperCustom;
	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
		return mapperCustom.findUserList(userQueryVo);
	}
	
	@Override
	public List<UserCustom> findUserListByUnamePage(PageBean<UserCustom> pageBean) throws Exception {
		
		return mapperCustom.findUserListByUnamePage(pageBean);
	}
	
	@Override
	public List<UserDTO> findUserDTOListByUnamePage(UserQueryVo userQueryVo) throws Exception {
		
		return mapperCustom.findUserDTOListByUnamePage(userQueryVo);
	}

	@Override
	public Integer findUserCountByUname(UserQueryVo userQueryVo) throws Exception {
		return mapperCustom.findUserCountByUname(userQueryVo);
	}

	@Override
	public UserCustom findUserById(Integer id) throws Exception {
		User user = mapper.selectByPrimaryKey(id);
		if(user == null) {
			throw new CustomException("用户不存在!");
		}
		UserCustom userCustom = null;
		if(user != null) {
			userCustom = new UserCustom();
			BeanUtils.copyProperties(user, userCustom);
		}
		return userCustom;
	}

	@Override
	public void updateUser(Integer id, UserCustom userCustom) throws Exception {
		User user1 = mapper.selectByPrimaryKey(id);
		if(user1 == null) {
			throw new CustomException("用户不存在!");
		}
		userCustom.setUid(id);
		User user = new User();
		BeanUtils.copyProperties(userCustom, user);
		mapper.updateByPrimaryKey(user);
		
	}

	@Override
	public void deleteUser(Integer id) throws Exception {
		mapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void insertUser(UserCustom userCustom) throws Exception {
	
		User user = new User();
		BeanUtils.copyProperties(userCustom, user);
		mapper.insert(user);
	}

	@Override
	public UserCustom findUserByUname(String uname) throws Exception {
		UserCustom userCustom = mapperCustom.findUserByUname(uname);
//		if(userCustom == null) {
//			throw new CustomException("用户不存在！");
//		}
		
		return userCustom;
	}

	@Override
	public List<UserCustom> findUserByUnameUpassword(UserQueryVo userQueryVo) throws Exception {
		
		return mapperCustom.findUserByUnameUpassword(userQueryVo);
	}

	

}
