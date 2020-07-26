package com.osquare.java.designpattern.behavioral.templatemethod.chap1;

public abstract class OrderTemplate {
    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doRecipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if(isGift) {
            wrapGift();
        } else {
            doRecipt();
        }
        doDelivery();
    }

}
