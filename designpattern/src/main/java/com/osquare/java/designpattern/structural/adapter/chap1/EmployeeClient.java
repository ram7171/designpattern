package com.osquare.java.designpattern.structural.adapter.chap1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeDB = new EmployeeDB("123","ABC","XYZ","test@test.com");
        employees.add(employeeDB);
        return employees;
    }
}
