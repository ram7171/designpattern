package com.osquare.java.designpattern.structural.adapter.chap1;

public class EmployeeCSVAdaptor implements Employee {
    private EmployeeCSV instance;

    public EmployeeCSVAdaptor(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    public String toString() {
        return instance.getId() + " |" + instance.getFirstname() + " | " + instance.getLastname()
                + "| " + instance.getEmailAddress();
    }
}
