package com.osquare.java.designpattern.behavioral.state.chap1;

public class FanLowState extends State {
    private Fan fan;
    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to MED");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is LOW";
    }
}
