package com.jk.pojo;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
public class area {
    private int areaid;
    private String areaname;
    private int parentid;

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public area() {
    }

    public area(int areaid, String areaname, int parentid) {
        this.areaid = areaid;
        this.areaname = areaname;
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "area{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
