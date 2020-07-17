package com.osquare.java.designpattern.creational.abstractfactory.chap1;

public abstract class CreditCard {
    protected int cardNumberLength;
    protected int cscNumber;

    public int getCardNumberLength() { return this.cardNumberLength;}
    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() { return this.cscNumber;}
    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
