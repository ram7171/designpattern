package com.osquare.java.designpattern.behavioral.templatemethod.chap1;

public class Person implements Comparable<Person> {
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

    @Override
    public int compareTo(Person o) {
        if(this.age > o.getAge()) {
            return 1;
        }
        if(this.age < o.getAge()) {
            return -1;
        }
        return 0;
    }
}
