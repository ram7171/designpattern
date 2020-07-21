package com.osquare.java.designpattern.structural.flyweight.chap1;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
