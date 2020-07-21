package com.osquare.java.designpattern.structural.bridge.chap1;

public class BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape shape = new Square(blue);
        shape.applyColor();

        Shape circle = new Circle(new Red());
        circle.applyColor();

        circle = new Circle(new Green());
        circle.applyColor();



    }
}
