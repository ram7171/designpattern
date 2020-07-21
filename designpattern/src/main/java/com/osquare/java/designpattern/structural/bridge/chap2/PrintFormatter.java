package com.osquare.java.designpattern.structural.bridge.chap2;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for(Detail detail : details) {
            builder.append(detail.getLabel() + " : ");
            builder.append(detail.getValue() + " \n");
        }
        return builder.toString();
    }
}
