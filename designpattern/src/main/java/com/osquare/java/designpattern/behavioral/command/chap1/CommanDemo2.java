package com.osquare.java.designpattern.behavioral.command.chap1;

import java.util.ArrayList;
import java.util.List;

public class CommanDemo2 {
    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light gichenRoomLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCmd = new ToggleCommand(bedRoomLight);
        lightSwitch.storeAndExecute(toggleCmd);
        lightSwitch.storeAndExecute(toggleCmd);

        List<Light> lightList = new ArrayList<>();
        lightList.add(bedRoomLight);lightList.add(gichenRoomLight);
        Command allLightCommand = new AllLightsCommand(lightList);

        lightSwitch.storeAndExecute(allLightCommand);
    }
}
