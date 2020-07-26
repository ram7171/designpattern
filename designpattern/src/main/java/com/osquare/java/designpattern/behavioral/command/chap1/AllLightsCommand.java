package com.osquare.java.designpattern.behavioral.command.chap1;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> allLight;
    public AllLightsCommand(List<Light> allLight) {
        this.allLight = allLight;
    }

    @Override
    public void execute() {
        for(Light light : allLight) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
