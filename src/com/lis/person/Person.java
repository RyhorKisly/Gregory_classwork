package com.lis.person;

public class Person {
    private String fullName;
    private int age;
    private String sex;

    public String getSex() {
        return sex;
    }

    public Person(String fullName, int age, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }
    public void print(){
        System.out.println("fullname: " + fullName + " age:" + age + " sex:" + sex);
    }
}
