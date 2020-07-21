package com.osquare.java.designpattern.structural.bridge.chap2;

import java.util.List;

public class HTMLFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table><th> Classification</th>");
        builder.append("<th>" + header + "</th>");

        for (Detail detail: details) {
            builder.append("<tr><td>" + detail.getLabel() + "</td>");
            builder.append("<td>" + detail.getValue() + "</td></tr>");

        }
        builder.append("</table>");

        return builder.toString();
    }
}
