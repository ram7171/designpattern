package com.osquare.java.designpattern.behavioral.observer.chap1;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {
    private Deque<String> msgHistory = new ArrayDeque<>();

    @Override
    void setState(String msg) {
        msgHistory.add(msg);
        super.notifyServer();
    }

    @Override
    String getState() {
        return msgHistory.getLast();
    }
}
