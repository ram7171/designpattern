package com.osquare.java.designpattern.structural.decorator.chap1;

public class DressDecortor extends SandwichDecorator {
    public DressDecortor(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
