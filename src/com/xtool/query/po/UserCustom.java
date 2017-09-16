package com.xtool.query.po;

import java.util.List;

public class UserCustom {
	
	private String key;
	
	private Integer uid;

    private String uname;

    private String upassword;
    
    private List<CarCustom> custom;
    
    private CarCustom carCustom;
    
	
	public CarCustom getCarCustom() {
		return carCustom;
	}

	public void setCarCustom(CarCustom carCustom) {
		this.carCustom = carCustom;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<CarCustom> getCustom() {
		return custom;
	}

	public void setCustom(List<CarCustom> custom) {
		this.custom = custom;
	}

	

}
