package com.xtool.query.mapper;

import java.util.List;

import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcDTO;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.PageBean;

public interface DtcMapperCustom {
	
	/**
	 * 查询故障码
	 * @param dtcQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<DtcCustom> findDtcList(DtcQueryVo dtcQueryVo) throws Exception;
	
	public List<DtcDTO> findDtcListByQuery(DtcQueryVo dtcQueryVo) throws Exception;
	
	public List<DtcCustom> findDtcListByPage(PageBean<DtcCustom> pageBean) throws Exception;
	
	public Integer findDtcCount() throws Exception;
	
	public Integer findDtcCountByDcode(DtcQueryVo dtcQueryVo) throws Exception;
	
	public List<DtcDTO> findDtcDTOList(DtcQueryVo dtcQueryVo) throws Exception;
	
	
}
