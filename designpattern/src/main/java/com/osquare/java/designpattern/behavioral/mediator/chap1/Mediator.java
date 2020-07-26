package com.osquare.java.designpattern.behavioral.mediator.chap1;

import com.osquare.java.designpattern.behavioral.command.chap1.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLight() {
        for(Light light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLight() {
        for(Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
