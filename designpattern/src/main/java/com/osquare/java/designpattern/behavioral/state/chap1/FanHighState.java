package com.osquare.java.designpattern.behavioral.state.chap1;

public class FanHighState extends State {
    private Fan fan;
    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to OFF");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is HIGH";
    }
}
