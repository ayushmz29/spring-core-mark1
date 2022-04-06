package com.spring.referenceInjection;

//Class A is dependent on class B
public class MyClassB {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyClassB{" +
                "y=" + y +
                '}';
    }
}
