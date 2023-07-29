package com.springcore;

import com.springcore.com.collections.Hacker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Hacker hacker = (Hacker) context.getBean("hacker");
        System.out.println(hacker);
    }
}
