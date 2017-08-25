package com.xtool.query.mapper;

import java.util.List;

import com.xtool.query.po.CarCustom;
import com.xtool.query.po.CarQueryVo;
import com.xtool.query.po.PageBean;

public interface CarMapperCustom {
	
	public List<CarCustom> findCarListByCnamePage(PageBean<CarCustom> pageBean) throws Exception;
	
	public Integer findCarCountByCname(CarQueryVo carQueryVo) throws Exception;
	
	public List<CarCustom> findCarByCuid(Integer cuid) throws Exception;

}
