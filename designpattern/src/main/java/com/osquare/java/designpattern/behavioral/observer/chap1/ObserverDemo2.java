package com.osquare.java.designpattern.behavioral.observer.chap1;

public class ObserverDemo2 {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);
        phoneClient.addMessage("Here is a new message");
//        tabletClient.addMessage("Another new message");
    }
}
