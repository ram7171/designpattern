package com.osquare.java.designpattern.singleton.chap1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        DBSingleton instance1 = DBSingleton.getInstance();
        System.out.println(instance1);

        long timeBefore = 0;
        long timeAfter = 0;
        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;
        try {
            statement = conn.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR (10)," +
                    " City VARCHAR(10))");
            System.out.println("Table create!");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);


    }
}
