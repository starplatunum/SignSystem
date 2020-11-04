package com.example.signsystem.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;

public class Admin extends BmobObject implements Serializable {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
