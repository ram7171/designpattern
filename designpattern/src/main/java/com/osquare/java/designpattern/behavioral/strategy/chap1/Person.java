package com.osquare.java.designpattern.behavioral.strategy.chap1;

public class Person {
    private int age;
    private String name;
    private String phone;

    public Person() {}
    public Person(String name, String phone,int age) {
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
