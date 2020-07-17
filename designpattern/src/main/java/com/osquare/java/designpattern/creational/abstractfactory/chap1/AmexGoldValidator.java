package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public class AmexGoldValidator implements Validtor {

    @Override
    public boolean isValid(CreditCard card) {
        return false;
    }
}
