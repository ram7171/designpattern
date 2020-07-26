package com.osquare.java.designpattern.behavioral.templatemethod.chap1;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Ring up item from cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with card present");
    }

    @Override
    public void doRecipt() {
        System.out.println("Print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag item at counter");
    }
}
