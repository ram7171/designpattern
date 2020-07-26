package com.osquare.java.designpattern.behavioral.command.chap1;

public class Light {
    private boolean flag = false;
    private String location = null;
    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return flag;
    }

    public void toggle() {
        if(flag) {
            off();
            flag = false;
        } else {
            on();flag = true;
        }

    }
    public void on() {
        System.out.println("Light switched on");
    }
    public void off() {
        System.out.println("Light switched off");
    }
}
