package com.osquare.java.designpattern.behavioral.strategy.chap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ABC","908-343-234",39));
        personList.add(new Person("XYZ","908-343-234",29));
        personList.add(new Person("PQR","908-343-234",39));
        personList.add(new Person("IJK","908-343-234",54));

        System.out.println("before sorting " + personList);
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() > o2.getAge()) {
                    return 1;
                }
                if(o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("sorting by age " + personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("sorting by name " + personList);
    }
    private static void printContents(List<Person> personList) {
        for(Person p : personList) {
            System.out.println(p.getName());
        }
    }
}
