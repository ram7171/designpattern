package com.osquare.java.designpattern.singleton.chap1;

public class Demo1 {
    public static void main(String[] args) {
        Runtime singletonObj = Runtime.getRuntime();
        singletonObj.gc();
        System.out.println(singletonObj);

        Runtime singletonObj1 = Runtime.getRuntime();
        System.out.println(singletonObj1);

        if(singletonObj == singletonObj1) {
            System.out.println("both object are same");
        }
    }

}
