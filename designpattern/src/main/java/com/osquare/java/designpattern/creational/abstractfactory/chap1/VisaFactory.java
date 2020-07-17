package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validtor getValidator(CardType type) {
        switch (type) {
            case GOLD:
                return new VisaCardValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }


}
