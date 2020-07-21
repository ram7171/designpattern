package com.osquare.java.designpattern.structural.bridge.chap1.withoutbridge;

public class WithoutBridgeDemo {
    public static void main(String[] args) {
        Circle c = new BlueCircle();
        Square s = new RedSquare();
        Square gs = new GreenSquare();
        c.applyColor();s.applyColor();gs.applyColor();
    }
}
