package com.osquare.java.designpattern.structural.facade.chap1;
import com.osquare.java.designpattern.singleton.chap1.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCFacade {
    DBSingleton instance = null;

    public JDBCFacade() {
        instance = DBSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address(ID INTEGER , StreetName VARCHAR(20)," +
                    "City VARCHAR(20))");
            sta.close();
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) " +
                    "values (2, '234 street', 'madras')");
            System.out.println("table created " + count);
            sta.close();
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  count;
    }

    public List<Address> getAddress() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery("SELECT * FROM Address");
            while(resultSet.next()) {
                addresses.add(new Address(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3) ));
            }
            resultSet.close();
            sta.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
