package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
    public static void main(String[] args) {
        //note, creating application context
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/configCollection.xml");

        //note, type casting and linking beans to context
        //now, emp1 object is created at run time by Spring
        Emp emp1 = (Emp)context.getBean("emp1");

        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
    }
}
