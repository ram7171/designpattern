package com.osquare.java.designpattern.behavioral.memonto.chap1;

import java.util.Stack;

public class CareTaker {
    private Stack<EmployeeMemonto> stack = new Stack<>();
    public void save(Employee1 emp) {
        stack.push(emp.save());
    }

    public void revert(Employee1 emp) {
        emp.revert(stack.pop());
    }
}
