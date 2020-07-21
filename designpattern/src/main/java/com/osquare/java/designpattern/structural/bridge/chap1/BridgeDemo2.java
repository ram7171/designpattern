package com.osquare.java.designpattern.structural.bridge.chap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo2 {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection connection = DriverManager.getConnection(dbUrl);
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE Address(ID INT, StreetNamee VARCHAR(20)," +
                    "City VARCHAR(20))");

            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
