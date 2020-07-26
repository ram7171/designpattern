package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

public class VisitorDemo1 {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AdvPartsShippingVisitor());
        order.accept(new AdvPartsDisplayVisitor());
    }
}
