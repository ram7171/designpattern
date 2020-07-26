package com.osquare.java.designpattern.behavioral.chainofrsp.chap1;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityDemo1 {


    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityDemo1.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest");
        logger.fine("Fine1");
        logger.fine("Fine2");
    }
}
