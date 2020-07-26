package com.osquare.java.designpattern.behavioral.iterator.chap1;

import java.util.*;

public class IteratorPatternDemo1 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>(Arrays.asList("one", "two","three"));
//        Set<String> lists = new HashSet<>(Arrays.asList("one", "two","three"));
        Iterator<String> iterator = lists.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }
        System.out.println(lists.size());

        for(String name: lists) {
            System.out.println(name);
        }

        for(int i=0;i<lists.size();i++) {
            System.out.println(lists.get(i));
        }

    }
}
