package com.xtool.query.service;

import com.xtool.query.po.AdminCustom;
import com.xtool.query.po.AdminQueryVo;

public interface AdminService {

	public AdminCustom findAdmin(AdminQueryVo adminQueryVo) throws Exception;
}
