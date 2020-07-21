package com.osquare.java.designpattern.structural.bridge.chap2;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
