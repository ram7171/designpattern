package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

public interface AdvPartVisitor {
    void visit(Oil oil);
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(PartsOrder order);
}
