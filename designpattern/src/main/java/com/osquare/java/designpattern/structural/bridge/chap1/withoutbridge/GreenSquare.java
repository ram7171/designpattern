package com.osquare.java.designpattern.structural.bridge.chap1.withoutbridge;


public class GreenSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("Applying green color without bridge");
    }
}
