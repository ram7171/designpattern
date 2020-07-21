package com.osquare.java.designpattern.structural.bridge.chap1.withoutbridge;


public class BlueCircle extends Circle {

    @Override
    public void applyColor() {
        System.out.println("Applying Blue color without bridge");
    }
}
