package com.xtool.query.po;

public class Car {
    private Integer cid;

    private String cname;

    private String ctype;

    private String cproduct;

    private String cdisplacement;

    private Integer cuid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getCproduct() {
        return cproduct;
    }

    public void setCproduct(String cproduct) {
        this.cproduct = cproduct == null ? null : cproduct.trim();
    }

    public String getCdisplacement() {
        return cdisplacement;
    }

    public void setCdisplacement(String cdisplacement) {
        this.cdisplacement = cdisplacement == null ? null : cdisplacement.trim();
    }

    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }
}