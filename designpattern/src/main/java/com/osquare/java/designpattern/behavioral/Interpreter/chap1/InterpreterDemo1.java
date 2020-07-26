package com.osquare.java.designpattern.behavioral.Interpreter.chap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo1 {
    public static void main(String[] args) {
        String input = "lions and tigers and bear , lion, and tiger";

        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");
        Matcher matcher = pattern.matcher(input);

        while ((matcher.find())) {
            System.out.println("Found " + matcher.group());
        }
    }
}
