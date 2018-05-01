package com.ccjjltx.model;

import java.util.Date;

public class Einformation {
    private Integer pid;

    private String name;

    private String idcard;

    private String sex;

    private String address;

    private String ptype;

    private Date hiredate;

    private String education;

    private Date birthday;

    private Integer uid;

    public Einformation(Integer pid, String name, String idcard, String sex, String address, String ptype, Date hiredate, String education, Date birthday, Integer uid) {
        this.pid = pid;
        this.name = name;
        this.idcard = idcard;
        this.sex = sex;
        this.address = address;
        this.ptype = ptype;
        this.hiredate = hiredate;
        this.education = education;
        this.birthday = birthday;
        this.uid = uid;
    }

    public Einformation() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}