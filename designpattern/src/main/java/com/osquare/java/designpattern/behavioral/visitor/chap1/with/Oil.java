package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

public class Oil implements AdvPart {
    @Override
    public void accept(AdvPartVisitor visitor) {
        visitor.visit(this);
    }
}
