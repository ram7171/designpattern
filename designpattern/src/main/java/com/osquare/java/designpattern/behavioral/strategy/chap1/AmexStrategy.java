package com.osquare.java.designpattern.behavioral.strategy.chap1;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;
        isValid = creditCard.getNumber().startsWith("37") ||
                creditCard.getCcv().startsWith("34");
        if(isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }
        if(isValid) {
            isValid = passesLuh(creditCard.getNumber());
        }
        return isValid;
    }
}
