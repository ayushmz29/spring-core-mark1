package com.spring.autowiring;

//Emp class is dependent on Address class
public class Emp {
    private Address address;

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

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" + "address=" + address + '}';
    }
}