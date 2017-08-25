package com.xtool.query.mapper;

import java.util.List;

import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.po.UserQueryVo;

public interface UserMapperCustom {
	
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	public List<UserCustom> findUserListByUnamePage(PageBean<UserCustom> pageBean) throws Exception;

	public Integer findUserCountByUname(UserQueryVo userQueryVo) throws Exception;
	
	public UserCustom findUserByUname(String uname) throws Exception;
	
}
