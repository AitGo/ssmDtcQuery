package com.xtool.query.mapper;

import com.xtool.query.po.AdminCustom;
import com.xtool.query.po.AdminQueryVo;

public interface AdminMapperCustom {
	
	/**
	 * 管理员登录
	 * @throws Exception
	 */
	public AdminCustom findAdmin(AdminQueryVo adminQueryVo) throws Exception;

}
