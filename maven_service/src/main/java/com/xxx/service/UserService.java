package com.xxx.service;

import com.xxx.dao.UserDao;

public class UserService {
    public static void userService(){
        System.out.println("userService...");
        UserDao.daoTest();
    }
}
