package com.osquare.java.designpattern.structural.bridge.chap1.withoutbridge;


public class RedSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("applying red square color without bridge");
    }
}
