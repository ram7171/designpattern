package com.osquare.java.designpattern.behavioral.Interpreter.chap1;

/**
 * this pattern is very useful to avoid the switch or multiple if /else statment
 */

public class InterpreterDemo2 {
    static Expression buildInterpreterTree() {
        Expression termal1 = new TerminalExpression("Lions");
        Expression termal2 = new TerminalExpression("Tigers");
        Expression termal3 = new TerminalExpression("Bears");

        Expression altExression1 = new AndExpression(termal2, termal3);
        Expression orExression1 = new OrExpression(termal1, altExression1);

        return new AndExpression(termal3, orExression1);
    }

    /**
     * build the interpreter and interpret the specific sequence
     * @param args
     */
    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lion Tigers";
//        String context = "Lion Bears";
        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }
}
