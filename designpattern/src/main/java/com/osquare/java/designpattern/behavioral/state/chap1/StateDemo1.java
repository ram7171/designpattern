package com.osquare.java.designpattern.behavioral.state.chap1;

public class StateDemo1 {
    public static void main(String[] args) {
        Fan1 fan = new Fan1();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);

    }
}
