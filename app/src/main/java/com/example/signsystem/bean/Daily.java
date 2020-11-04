package com.example.signsystem.bean;

import cn.bmob.v3.BmobObject;

public class Daily extends BmobObject {
    private String stuNum;//学生学号或者老师工号
    private String name;//名字
    private String isNormal;//是否正常
    private String time;
    private String type;//0学生  1老师
    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(String isNormal) {
        this.isNormal = isNormal;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
