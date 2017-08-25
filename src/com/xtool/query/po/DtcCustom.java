package com.xtool.query.po;

public class DtcCustom extends Dtc{
	
	private String aesKey;
	
	private String dinfo;

	private String dcause;

	private String dfix;
	

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	public String getDinfo() {
		return dinfo;
	}

	public void setDinfo(String dinfo) {
		this.dinfo = dinfo;
	}

	public String getDcause() {
		return dcause;
	}

	public void setDcause(String dcause) {
		this.dcause = dcause;
	}

	public String getDfix() {
		return dfix;
	}

	public void setDfix(String dfix) {
		this.dfix = dfix;
	}

	@Override
	public String toString() {
		return "DtcCustom [dinfo=" + dinfo + ", dcause=" + dcause + ", dfix=" + dfix + "]";
	}
	
	

}
