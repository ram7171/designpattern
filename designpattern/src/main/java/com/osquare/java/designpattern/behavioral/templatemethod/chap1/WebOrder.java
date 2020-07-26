package com.osquare.java.designpattern.behavioral.templatemethod.chap1;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart");
        System.out.println("Set gift preference");
        System.out.println("Set delivery address");
        System.out.println("Set billing address");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without card present");
    }

    @Override
    public void doRecipt() {
        System.out.println("Email recipts");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
