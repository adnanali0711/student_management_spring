package com.example.student_management_system;

public class Student {
    private int rollNo;
    private String name;
    private String mobileNo;
    private int age;

    public Student(int rollNo, String name, String mobileNo, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
