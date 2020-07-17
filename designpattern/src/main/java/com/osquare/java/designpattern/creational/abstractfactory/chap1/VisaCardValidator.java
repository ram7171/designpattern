package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public class VisaCardValidator implements Validtor {
    @Override
    public boolean isValid(CreditCard card) {
        return false;
    }
}
