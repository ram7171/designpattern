package com.osquare.java.designpattern.behavioral.mediator.chap1;

import com.osquare.java.designpattern.behavioral.command.chap1.Command;

public class TurnOffAllLightCommand implements Command {
    private Mediator mediator;
    public TurnOffAllLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLight();
    }
}
