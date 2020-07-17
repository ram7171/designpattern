package com.osquare.java.designpattern.singleton.chap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
//    private static DBSingleton instance = new DBSingleton(); // this kind of object creation egarly logading

    //lazy loading, volatile make object to  thread safe
    private static volatile DBSingleton instance = null;
    private static volatile Connection conn = null;
    //to control the creation of object through reflection
    private DBSingleton() {
        try {
            DriverManager.registerDriver(null/*new org.apache.derby.jdbc.EmbeddedDriver()*/);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        if(conn != null) {
            throw new RuntimeException("use getinstance method to create object");
        }

        if(instance != null) {
            throw new RuntimeException("use getintance method to create object");
        }
    }
    public static DBSingleton getInstance() {
        if(instance == null) {
            synchronized(DBSingleton.class) {
                if(instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if(conn == null) {
            synchronized (DBSingleton.class) {
                if(conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
