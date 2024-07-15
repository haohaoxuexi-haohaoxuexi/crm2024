package com.hello.spring6.test;

import com.hello.spring6.bean.Student;
import com.hello.spring6.bean.User;
import com.hello.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {
    @Test
    public void testDIAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        User user = applicationContext.getBean("user", User.class);
        user.printAge();
    }

    @Test
    public void testDate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        Student stuBean = applicationContext.getBean("stuBean", Student.class);
        System.out.println(stuBean);
    }

    @Test
    public void testUserService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        UserService userServiceBean = applicationContext.getBean("UserServiceBean", UserService.class);
        userServiceBean.save();
    }

}
