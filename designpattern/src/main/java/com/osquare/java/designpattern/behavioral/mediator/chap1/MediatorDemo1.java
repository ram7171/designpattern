package com.osquare.java.designpattern.behavioral.mediator.chap1;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo1 {
    private Timer timer;

    public MediatorDemo1(int seconds) {
        timer = new Timer();
        timer.schedule(new RemaindTask(), seconds * 1000);
        timer.schedule(new RemaindTaskWithoutBeep(), seconds * 3 * 1000);
    }

    public static void main(String[] args) {
        new MediatorDemo1(2);
    }

    private class RemaindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Timer is up");
//            timer.cancel();
        }
    }

    private class RemaindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Timer is really up");
            timer.cancel();
        }
    }
}
