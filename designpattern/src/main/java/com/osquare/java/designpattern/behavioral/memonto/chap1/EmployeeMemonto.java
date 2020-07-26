package com.osquare.java.designpattern.behavioral.memonto.chap1;

public class EmployeeMemonto {
    private String name;
    private String phone;

    public EmployeeMemonto(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return "Memonto -->" + name + " | " + phone;
    }
}
