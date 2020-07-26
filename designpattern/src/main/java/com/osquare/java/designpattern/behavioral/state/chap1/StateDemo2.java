package com.osquare.java.designpattern.behavioral.state.chap1;

public class StateDemo2 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

    }
}
