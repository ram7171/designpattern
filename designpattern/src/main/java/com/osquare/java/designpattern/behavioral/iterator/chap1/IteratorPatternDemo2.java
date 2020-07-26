package com.osquare.java.designpattern.behavioral.iterator.chap1;

import java.util.Iterator;

public class IteratorPatternDemo2 {
    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();

        repository.add("One");
        repository.add("Two");
        repository.add("Three");

        Iterator<String> iterator = repository.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String bike: repository) {
            System.out.println(bike);
        }

    }
}
