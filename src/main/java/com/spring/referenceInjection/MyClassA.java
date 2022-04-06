package com.spring.referenceInjection;

public class MyClassA {
    private int x;
    private MyClassB obj;

    //imp, Assuming classA is dependent on classB

    //default constructor
    public MyClassA(){
        super();
    }

    //param constructor
    public MyClassA(int x){
        this.x = x;
    }

    //getters/setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public MyClassB getObj() {
        return obj;
    }

    public void setObj(MyClassB obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "MyClassA{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}