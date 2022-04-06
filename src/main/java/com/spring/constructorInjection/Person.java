package com.spring.constructorInjection;

//imp Person class is dependent on Certi class
public class Person {
    private String name;
    private int personId;
    private Certi cert1;

    //param constructor
    public Person(String name, int personId, Certi cert1) {
        this.name = name;
        this.personId = personId;
        this.cert1 = cert1;
    }

    //default
    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", cert1.name=" + cert1.name +
                '}';
    }
}
