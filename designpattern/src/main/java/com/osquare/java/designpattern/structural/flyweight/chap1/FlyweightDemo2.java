package com.osquare.java.designpattern.structural.flyweight.chap1;

public class FlyweightDemo2 {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();
        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose headphone", 324);
        ims.takeOrder("samsung tv", 354);
        ims.takeOrder("samsung tv", 2324);
        ims.takeOrder("Roomba", 324);
        ims.takeOrder("Bose Headphone", 324);
        ims.takeOrder("Bose headphone", 324);
        ims.takeOrder("Roomba", 324);
        ims.takeOrder("samsung tv", 2324);
        ims.takeOrder("samsung tv", 2324);

        ims.process();
        System.out.println(ims.report());
    }
}
