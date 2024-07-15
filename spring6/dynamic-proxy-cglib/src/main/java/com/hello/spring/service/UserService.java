package com.hello.spring.service;

public class UserService {
    public boolean login(String username, String password){
        if("admin".equals(username) && "123".equals(password)){
            return true;
        }else{
            return false;
        }
    }
    public void logout(){
        System.out.println("系统正在退出。。。");
    }
}
