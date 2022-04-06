package com.spring.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/referenceInjection/configReference.xml");
        MyClassA objA = (MyClassA) context.getBean("objectA");
        MyClassB objB = (MyClassB)context.getBean("objectB");

        System.out.println(objA.toString());
        System.out.println(objB.toString());

    }

}
