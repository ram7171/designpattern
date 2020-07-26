package com.osquare.java.designpattern.behavioral.templatemethod.chap1;

public class TemplateMethodDemo2 {
    public static void main(String[] args) {
        System.out.println("Web order");

        OrderTemplate orderTemplate = new WebOrder();
        orderTemplate.processOrder();

        System.out.println("Store Order");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
