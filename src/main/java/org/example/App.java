package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //injecting object here using Spring

        //put config file inside
        //if we have a single file then we can just specify a string and in-case of multiple files we can specify array
        // ApplicationContext context = new ClassPathXmlApplicationContext (new String [] {"services.xml", "daos.xml"}).
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/config.xml");

        //to get the bean (here, it's student object), using 'getBean()' to insert beans into the ApplicationContext
        Student s1 = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");

        //printing the object reference will call the toString() method which is defined by us
        System.out.println(s1);
        System.out.println(s2);
    }
}
