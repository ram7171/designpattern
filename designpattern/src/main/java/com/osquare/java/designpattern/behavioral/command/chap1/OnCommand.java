package com.osquare.java.designpattern.behavioral.command.chap1;

public class OnCommand implements Command {
    private Light light;
    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
