package com.osquare.java.designpattern.behavioral.memonto.chap1;

import java.io.*;

public class MemontoDemo1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("ABC");emp.setAddress("London"); emp.setPhone("98293497");
        serialize(emp);

        Employee emp1 = deSerialize();
        System.out.println(emp1.getName());
    }

    private static void serialize(Employee emp)  {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
            out.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deSerialize()  {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"))) {
            return (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
