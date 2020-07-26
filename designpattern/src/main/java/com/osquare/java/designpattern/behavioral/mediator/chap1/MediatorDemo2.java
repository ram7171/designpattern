package com.osquare.java.designpattern.behavioral.mediator.chap1;

import com.osquare.java.designpattern.behavioral.command.chap1.Command;
import com.osquare.java.designpattern.behavioral.command.chap1.Light;

public class MediatorDemo2 {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Light bedRmLight = new Light("bedroom");
        Light gitchedRmLight = new Light("gitchen");
        mediator.registerLight(bedRmLight); mediator.registerLight(gitchedRmLight);

        Command turnOnAllLight = new TurnOnAllLightCommand(mediator);
        turnOnAllLight.execute();

        Command turnOffAllLight = new TurnOffAllLightCommand(mediator);
        turnOffAllLight.execute();
    }
}
