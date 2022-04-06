package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/constructorInjection/configConstructor.xml");
        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);
    }

}
