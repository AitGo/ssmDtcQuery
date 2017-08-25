package com.xtool.query.po;

public class DtcWithBLOBs extends Dtc {
    private String dinfo;

    private String dcause;

    private String dfix;

    public String getDinfo() {
        return dinfo;
    }

    public void setDinfo(String dinfo) {
        this.dinfo = dinfo == null ? null : dinfo.trim();
    }

    public String getDcause() {
        return dcause;
    }

    public void setDcause(String dcause) {
        this.dcause = dcause == null ? null : dcause.trim();
    }

    public String getDfix() {
        return dfix;
    }

    public void setDfix(String dfix) {
        this.dfix = dfix == null ? null : dfix.trim();
    }
}