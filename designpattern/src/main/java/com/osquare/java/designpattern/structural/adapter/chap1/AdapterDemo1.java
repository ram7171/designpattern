package com.osquare.java.designpattern.structural.adapter.chap1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo1 {
    public static void main(String[] args) {
        Integer[] arrayOfInteger = new Integer[] { 1,2, 3, 4, 5 };
        List<Integer> integerList = Arrays.asList(arrayOfInteger);
        System.out.println(arrayOfInteger + " | " + integerList);

        System.out.println("---------------------------");

        List<Employee> empList = new ArrayList<>();
        Employee emp = new EmployeeDB("123","abc","xyz","test@test.com");
        empList.add(emp);

        //Employee employeeLdap = new EmployeeLdap("l123","lABC","lZYZ", "lmail.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("l123","lABC","lZYZ", "lmail.com");
        empList.add(new EmployeeAdaptor(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@test.com");
        empList.add(new EmployeeCSVAdaptor(employeeCSV));

        System.out.println(empList);
    }
}
