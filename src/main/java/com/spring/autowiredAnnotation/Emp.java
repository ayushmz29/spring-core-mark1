package com.spring.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Emp class is dependent on Address class
public class Emp {
    //imp, using autowired annotation here using 'byType'
    @Autowired
    private Address address;

    //imp, using autowired annotation here by 'constructor'
    //@Autowired
    //param, constructor
    public Emp(Address address) {
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Address getAddress() {
        return address;
    }

    //imp, using autowired annotation here by setter method
    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" + "address=" + address + '}';
    }
}