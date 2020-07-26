package com.osquare.java.designpattern.behavioral.observer.chap1;

public class PhoneClient extends Observer {
    private Subject subject;

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
