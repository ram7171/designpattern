package com.osquare.java.designpattern.structural.adapter.chap1;

public class EmployeeAdaptor implements Employee {

    private EmployeeLdap instance;
    public EmployeeAdaptor(EmployeeLdap instance) {
        this.instance = instance;
    }
    @Override
    public String getId() {
        return instance.getCn();
    }
    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return instance.getCn() +"|"+ instance.getSurname() +"|"+ instance.getGivenName() +"|"+ instance.getMail();
    }
}
