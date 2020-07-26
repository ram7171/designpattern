package com.osquare.java.designpattern.behavioral.command.chap1;

//invoker
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
