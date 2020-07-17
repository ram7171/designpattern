package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType type);
    public abstract Validtor getValidator(CardType type);
}
