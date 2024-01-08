package com.zzf.ioc_02;

/*
 * Created by zuozhongfei on 2024/1/8
 */
public class UserService {
    private UserDao userDao;

    private int age;
    private String name;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public UserService(int age,String name,UserDao userDao){
        this.userDao = userDao;
        this.age = age;
        this.name = name;
    }
}
