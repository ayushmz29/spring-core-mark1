package com.spring.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/autowiredAnnotation/configAutowiring.xml");

        Emp emp1 = (Emp)context.getBean("emp1");
        //OR, Emp emp1 = context.getBean("emp1", Emp .class);

        System.out.println(emp1);
    }
}
