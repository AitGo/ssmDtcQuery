package com.xtool.query.po;

import java.util.List;

public class UserDTO {

	private String key;
	
    private String uname;
    
    private String islogin;

    private CarDTO carDTO;
    
	public String getIslogin() {
		return islogin;
	}

	public void setIslogin(String islogin) {
		this.islogin = islogin;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public CarDTO getCarDTO() {
		return carDTO;
	}

	public void setCarDTO(CarDTO carDTO) {
		this.carDTO = carDTO;
	}

	
    
    
}
