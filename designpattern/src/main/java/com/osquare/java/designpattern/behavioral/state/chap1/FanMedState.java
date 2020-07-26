package com.osquare.java.designpattern.behavioral.state.chap1;

public class FanMedState extends State {
    private Fan fan;
    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to HIGH");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is MED";
    }
}
