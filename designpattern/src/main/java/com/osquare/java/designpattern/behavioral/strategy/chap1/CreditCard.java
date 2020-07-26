package com.osquare.java.designpattern.behavioral.strategy.chap1;

public class CreditCard {
    private String number;
    private String date;
    private String ccv;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
}
