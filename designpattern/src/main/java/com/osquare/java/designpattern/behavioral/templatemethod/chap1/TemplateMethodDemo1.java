package com.osquare.java.designpattern.behavioral.templatemethod.chap1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateMethodDemo1 {
    private static void printContents(List<Person> personList) {
        for(Person p : personList) {
            System.out.println(p.getName());
        }
    }
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ABC","908-343-234",39));
        personList.add(new Person("XYZ","908-343-234",29));
        personList.add(new Person("PQR","908-343-234",19));
        personList.add(new Person("IJK","908-343-234",54));

        System.out.println("not sorted-->");
        printContents(personList);

        Collections.sort(personList);
        System.out.println("sort by age-->");
        printContents(personList);
    }
}
