package com.xtool.query.service;

import java.util.List;

import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcDTO;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.PageBean;

public interface DtcService {

	public List<DtcCustom> findDtcList(DtcQueryVo dtcQueryVo)throws Exception;
	
	public List<DtcDTO> findDtcListByQuery(DtcQueryVo dtcQueryVo)throws Exception;
	
	public DtcCustom findDtcById(Integer id) throws Exception;
	
	public void updateDtc(Integer id,DtcCustom dtcCustom) throws Exception;
	
	public List<DtcCustom> findDtcListByPage(PageBean<DtcCustom> pageBean) throws Exception;
	
	public Integer findDtcCount() throws Exception;
	
	public Integer findDtcCountByDcode(DtcQueryVo dtcQueryVo) throws Exception;
	
	public void deleteDtc(Integer id) throws Exception;
	
	public void insertDtc(DtcCustom dtcCustom) throws Exception;
	
	public List<DtcDTO> findDtcDTOList(DtcQueryVo dtcQueryVo)throws Exception;
}
