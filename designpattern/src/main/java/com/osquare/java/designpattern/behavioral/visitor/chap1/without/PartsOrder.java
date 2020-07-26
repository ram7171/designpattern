package com.osquare.java.designpattern.behavioral.visitor.chap1.without;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AdvPart {
    private List<AdvPart> parts = new ArrayList<>();
    public PartsOrder() {}

    public void addPart(AdvPart part) {
        parts.add(part);
    }
    public List<AdvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping() {
        double shippingCost = 0;
        for(AdvPart part : parts) {
            shippingCost += part.calculateShipping();
        }
        return shippingCost;
    }
}
