package com.osquare.java.designpattern.behavioral.strategy.chap1;

public class StrategyDemo2 {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883463283");amexCard.setDate("04/2020");amexCard.setCcv("123");

        System.out.println("Is Amex valid:"  + amexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");visaCard.setDate("04/2020");visaCard.setCcv("123");

        System.out.println("Is visa valid:"  + visaCard.isValid());
    }
}
