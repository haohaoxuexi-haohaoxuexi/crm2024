package com.hello.spring.client;

import com.hello.spring.service.TimerMethodInterceptor;
import com.hello.spring.service.UserService;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new TimerMethodInterceptor());
        UserService userService = (UserService) enhancer.create();
        boolean success = userService.login("admin", "123");
        System.out.println(success ? "登录成功" : "登录失败");
        userService.logout();
    }

}
