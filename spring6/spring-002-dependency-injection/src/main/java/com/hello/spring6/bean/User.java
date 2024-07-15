package com.hello.spring6.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("30")
    private int age;
    public void printAge(){
        System.out.println(age);
        int newAge = age + 100;
        System.out.println(newAge);
    }
}
