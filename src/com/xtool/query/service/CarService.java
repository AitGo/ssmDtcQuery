package com.xtool.query.service;

import java.util.List;

import com.xtool.query.po.CarCustom;
import com.xtool.query.po.CarQueryVo;
import com.xtool.query.po.PageBean;

public interface CarService {
	
	public List<CarCustom> findCarListByCnamePage(PageBean<CarCustom> pageBean) throws Exception;
	
	public Integer findCarCountByCname(CarQueryVo carQueryVo) throws Exception;
	
	public void deleteCar(Integer id) throws Exception;
	
	public void updateCar(Integer id, CarCustom carCustom) throws Exception;
	
	public CarCustom findCarById(Integer id) throws Exception;
	
	public void insertCar(CarCustom carCustom) throws Exception;
	
	public List<CarCustom> findCarByCuid(Integer cuid) throws Exception;
}
