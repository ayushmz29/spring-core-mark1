package com.spring.constructorInjection;

public class Certi {
    public String name;

    //constr
    public Certi(String name) {
        this.name = name;
    }

    public Certi() {
        super();
    }

    @Override
    public String toString() {
        return "Certi{" + "name='" + name + '\'' + '}';
    }
}
