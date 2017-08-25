package com.xtool.query.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtool.query.exception.CustomException;
import com.xtool.query.mapper.CarMapper;
import com.xtool.query.mapper.CarMapperCustom;
import com.xtool.query.po.Car;
import com.xtool.query.po.CarCustom;
import com.xtool.query.po.CarQueryVo;
import com.xtool.query.po.PageBean;
import com.xtool.query.po.UserCustom;
import com.xtool.query.service.CarService;
import com.xtool.query.service.UserService;

public class CarServiceImpl implements CarService{

	@Autowired
	private CarMapperCustom mapperCustom;
	@Autowired
	private CarMapper mapper;

	@Override
	public List<CarCustom> findCarListByCnamePage(PageBean<CarCustom> pageBean) throws Exception {
		List<CarCustom> carList = mapperCustom.findCarListByCnamePage(pageBean);
		return carList;
	}
	
	@Override
	public Integer findCarCountByCname(CarQueryVo carQueryVo) throws Exception {
		
		return mapperCustom.findCarCountByCname(carQueryVo);
	}
	
	@Override
	public void deleteCar(Integer id) throws Exception {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateCar(Integer id, CarCustom carCustom) throws Exception {
		carCustom.setCid(id);
		Car car = new Car();
		BeanUtils.copyProperties(carCustom, car);
		mapper.updateByPrimaryKey(car);
		
	}

	@Override
	public CarCustom findCarById(Integer id) throws Exception {
		Car car = mapper.selectByPrimaryKey(id);
		if(car == null) {
			throw new CustomException("车辆不存在！");
		}
		CarCustom carCustom = null;
		if(car != null) {
			carCustom = new CarCustom();
			BeanUtils.copyProperties(car, carCustom);
		}
		return carCustom;
	}

	@Override
	public void insertCar(CarCustom carCustom) throws Exception {
		
		Car car = new Car();
		BeanUtils.copyProperties(carCustom, car);
		mapper.insert(car);
		
	}

	@Override
	public List<CarCustom> findCarByCuid(Integer cuid) throws Exception {
		
		return mapperCustom.findCarByCuid(cuid);
	}

}
