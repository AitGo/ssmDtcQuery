package com.xtool.query.po;

public class DtcCustom {
	
	private Integer did;

    private String dcode;

    private String dname;
	
	private String key;
	
	private String dinfo;

	private String dcause;

	private String dfix;
	

	

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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
		return "DtcCustom [did=" + did + ", dcode=" + dcode + ", dname=" + dname + ", key=" + key + ", dinfo=" + dinfo
				+ ", dcause=" + dcause + ", dfix=" + dfix + "]";
	}

	
	
	

}
