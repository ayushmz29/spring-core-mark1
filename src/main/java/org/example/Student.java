//This file is a bean, it can hold data
//the object of this class is created by the Spring Container and not by us
package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    // parametrized constructor
    public Student(int id, String name, String address) {
        super();
        this.studentName = name;
        this.studentAddress = address;
    }

    //default constructor
    Student() {
        super();
    }

    //setters
    public void setStudentId(int id) {
        this.studentId = id;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentAddress(String addrs) {
        this.studentAddress = addrs;
    }

    //getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    //Overriding the built-in method
    @Override
    public String toString() {
        return "Student {" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
