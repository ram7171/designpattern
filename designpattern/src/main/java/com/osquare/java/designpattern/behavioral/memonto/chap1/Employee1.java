package com.osquare.java.designpattern.behavioral.memonto.chap1;

import java.io.Serializable;

public class Employee1 {
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMemonto save() {
        return new EmployeeMemonto(name, phone);
    }

    public void revert(EmployeeMemonto emp) {
        this.name = emp.getName();
        this.phone = emp.getPhone();
    }

    public String toString() {
        return name +  " | "  + address + " |" + phone;
    }
}
