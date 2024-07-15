package com.hello.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
//        System.out.println("UserDao正在保存用户信息。");
        logger.info("UserDao正在保存用户信息。");
    }
}
