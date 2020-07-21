package com.osquare.java.designpattern.structural.flyweight.chap1;

public class FlyweightDemo1 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(10);
        Integer c = Integer.valueOf(15);
        System.out.println(a.hashCode() + "| " +  b.hashCode() + " | " + c.hashCode());
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
    }
}
