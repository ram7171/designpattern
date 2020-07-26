package com.osquare.java.designpattern.behavioral.observer.chap1;

import java.io.ObjectInputStream;
import java.util.Observable;
import java.util.Observer;

public class ObserverDemo1 {

    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();
        Client client1 = new Client("ABC");
        Client client2 = new Client("XYZ");
        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);
        twitterStream.someoneTweeted();
    }
}

class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

class Client implements Observer {
    private String name;
    public Client(String name) {
        this.name = name;
    }

    public void update(Observable observable, Object obj) {
        System.out.println("update " + name + " stream someone tweeted");
    }
}
