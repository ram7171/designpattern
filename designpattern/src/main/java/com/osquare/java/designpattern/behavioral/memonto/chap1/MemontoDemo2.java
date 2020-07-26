package com.osquare.java.designpattern.behavioral.memonto.chap1;

public class MemontoDemo2 {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Employee1 emp = new Employee1();
        emp.setName("ABC"); emp.setAddress("London"); emp.setPhone("098923434");
        System.out.println("employe before save " + emp);

        careTaker.save(emp);
        emp.setPhone("444-333-4544");
        careTaker.save(emp);
        System.out.println("employe before save " + emp);

        emp.setPhone("112-4444-2222");//we havenot called save mathod.
        System.out.println("save mthoed not called " + emp);

        careTaker.revert(emp);
        System.out.println("reverted to last point " + emp);

        careTaker.revert(emp);
        System.out.println("reverted to original " + emp);



    }
}
