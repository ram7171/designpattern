package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

public class Fender implements AdvPart {

    @Override
    public void accept(AdvPartVisitor visitor) {
        visitor.visit(this);
    }
}
