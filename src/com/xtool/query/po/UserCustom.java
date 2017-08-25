package com.xtool.query.po;

import java.util.List;

public class UserCustom extends User{
	
	private List<CarCustom> custom;

	public List<CarCustom> getCustom() {
		return custom;
	}

	public void setCustom(List<CarCustom> custom) {
		this.custom = custom;
	}

	

}
