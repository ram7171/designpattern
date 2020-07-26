package com.osquare.java.designpattern.behavioral.visitor.chap1.with;

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

    @Override
    public void accept(AdvPartVisitor visitor) {
        for(AdvPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
