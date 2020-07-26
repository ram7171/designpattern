package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

import java.util.List;

public class AdvPartsShippingVisitor implements AdvPartVisitor {
    double shippingCost = 0;
    @Override
    public void visit(Oil oil) {
        shippingCost += 5;
    }

    @Override
    public void visit(Wheel wheel) {
        shippingCost += 15;
    }

    @Override
    public void visit(Fender fender) {
        shippingCost += 5;
    }

    @Override
    public void visit(PartsOrder order) {
        System.out.println("If they bought more than 3 things we will them a discount");
        List<AdvPart> parts = order.getParts();
        if(parts.size() > 3) {
            shippingCost -= 5;
        }
        System.out.println("Shipping amount is= " + shippingCost);
    }


}
