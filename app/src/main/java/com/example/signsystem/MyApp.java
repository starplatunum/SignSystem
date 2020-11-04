package com.example.signsystem;

import android.app.Application;

import com.example.signsystem.bean.Admin;
import com.example.signsystem.bean.Choose;
import com.example.signsystem.bean.Course;
import com.example.signsystem.bean.Daily;
import com.example.signsystem.bean.Professor;
import com.example.signsystem.bean.Signin;
import com.example.signsystem.bean.Student;

import org.xml.sax.SAXException;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "c07ba07454ffc6ac7aee9c1a2d979676");
        initData();
    }

    public void initData() {
        Admin admin = new Admin();
        admin.setPwd("123");
        admin.setName("123");
        admin.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
        Choose choose = new Choose();
        choose.setClassName("123");
        choose.setClassNum("123");
        choose.setStuNum("123");
        choose.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
        Course course = new Course();
        course.setTeachTime("123");
        course.setTeacherNum("123");
        course.setClassNum("123");
        course.setClassName("123");
        course.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });

        Daily daily = new Daily();
        daily.setType("123");
        daily.setTime("123");
        daily.setStuNum("123");
        daily.setIsNormal("123");
        daily.setName("123");
        daily.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
        Professor professor = new Professor();
        professor.setCollege("123");
        professor.setName("123");
        professor.setpNum("123");
        professor.setPwd("123");
        professor.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
        Signin signin = new Signin();
        signin.setStuNum("123");
        signin.setSigned("123");
        signin.setSingTime("123");
        signin.setClassNum("123");
        signin.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
        Student student = new Student();
        student.setStuNum("123");
        student.setMajor("123");
        student.setCollege("123");
        student.setPwd("23");
        student.setName("123");
        student.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {

            }
        });
    }
}
