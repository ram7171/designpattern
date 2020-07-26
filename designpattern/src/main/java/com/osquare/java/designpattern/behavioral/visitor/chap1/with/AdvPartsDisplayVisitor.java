package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

public class AdvPartsDisplayVisitor implements AdvPartVisitor {
    @Override
    public void visit(Oil oil) {
        System.out.println("Display Oil");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Display wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Display fender");
    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("Display parts");
    }
}
