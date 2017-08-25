package com.xtool.query.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtool.query.exception.CustomException;
import com.xtool.query.mapper.DtcMapper;
import com.xtool.query.mapper.DtcMapperCustom;
import com.xtool.query.po.DtcCustom;
import com.xtool.query.po.DtcQueryVo;
import com.xtool.query.po.DtcWithBLOBs;
import com.xtool.query.po.PageBean;
import com.xtool.query.service.DtcService;

public class DtcServiceImpl implements DtcService{

	@Autowired
	private DtcMapperCustom mapperCustom;
	
	@Autowired
	private DtcMapper mapper;
	
	@Override
	public List<DtcCustom> findDtcList(DtcQueryVo dtcQueryVo) throws Exception {
		List<DtcCustom> findDtcList = mapperCustom.findDtcList(dtcQueryVo);
		return findDtcList;
	}
	
	public DtcCustom findDtcById(Integer id) throws Exception {
		DtcWithBLOBs dtcWithBlobs = mapper.selectByPrimaryKey(id);
		if(dtcWithBlobs == null) {
			throw new CustomException("故障码不存在!");
		}
		DtcCustom dtcCustom = null;
		if(dtcWithBlobs != null) {
			dtcCustom = new DtcCustom();
			BeanUtils.copyProperties(dtcWithBlobs, dtcCustom);
		}
		return dtcCustom;
	}

	@Override
	public void updateDtc(Integer id, DtcCustom dtcCustom) throws Exception {
		DtcWithBLOBs dtcWithBlobs = mapper.selectByPrimaryKey(id);
		if(dtcWithBlobs == null) {
			throw new CustomException("故障码不存在!");
		}
		dtcCustom.setDid(id);
		DtcWithBLOBs dtc = new DtcWithBLOBs();
		BeanUtils.copyProperties(dtcCustom, dtc);
		mapper.updateByPrimaryKeyWithBLOBs(dtc);
	}

	@Override
	public List<DtcCustom> findDtcListByPage(PageBean<DtcCustom> pageBean) throws Exception {
		List<DtcCustom> dtcListByPage = mapperCustom.findDtcListByPage(pageBean);
		return dtcListByPage;
	}

	@Override
	public Integer findDtcCount() throws Exception {
		
		return mapperCustom.findDtcCount();
	}
	
	@Override
	public Integer findDtcCountByDcode(DtcQueryVo dtcQueryVo) throws Exception {
		
		return mapperCustom.findDtcCountByDcode(dtcQueryVo);
	}

	@Override
	public void deleteDtc(Integer id) throws Exception {
		
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insertDtc(DtcCustom dtcCustom) throws Exception {
		DtcWithBLOBs dtc = new DtcWithBLOBs();
		BeanUtils.copyProperties(dtcCustom, dtc);
		mapper.insert(dtc);
		
	}

	
	
	

}
