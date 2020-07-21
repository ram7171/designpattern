package com.osquare.java.designpattern.structural.facade.chap1;

import com.osquare.java.designpattern.singleton.chap1.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WithoutFacadeDemo {
    public static void main(String[] args) {
        DBSingleton dbSingleton = DBSingleton.getInstance();
        try {
            Connection conn = dbSingleton.getConnection();
            Statement sta = conn.createStatement();

            int count = sta.executeUpdate("CREATE TABLE Address(ID INTEGER , StreetName VARCHAR(20)," +
                    "City VARCHAR(20))");
            System.out.println("table created " + count);
            sta.close();

            sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) " +
                    "values (1, '234 street', 'london')");
            System.out.println("record instered  " + count);
            sta.close();

            sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery("SELECT * FROM Address");
            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) +
                        resultSet.getString(2) +
                        resultSet.getString(3) );
            }
            sta.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
