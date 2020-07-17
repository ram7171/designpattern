package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = creditCardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card1 = creditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(card1.getClass());
    }
}
