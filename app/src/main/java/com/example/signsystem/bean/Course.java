package com.example.signsystem.bean;

import cn.bmob.v3.BmobObject;

public class Course extends BmobObject {
    //课程编号
    private String classNum;
    //教师编号
    private String teacherNum;

    //课程名
    private String className;
    //上课时间
    private String teachTime;

    public String getClassNum() {
        return classNum;
    }//

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(String teachTime) {
        this.teachTime = teachTime;
    }
}
