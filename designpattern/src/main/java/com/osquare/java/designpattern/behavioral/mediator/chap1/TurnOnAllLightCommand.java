package com.osquare.java.designpattern.behavioral.mediator.chap1;

import com.osquare.java.designpattern.behavioral.command.chap1.Command;

public class TurnOnAllLightCommand implements Command {
    private Mediator mediator;

    public TurnOnAllLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLight();
    }
}
