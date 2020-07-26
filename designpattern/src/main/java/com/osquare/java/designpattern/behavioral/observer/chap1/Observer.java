package com.osquare.java.designpattern.behavioral.observer.chap1;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
