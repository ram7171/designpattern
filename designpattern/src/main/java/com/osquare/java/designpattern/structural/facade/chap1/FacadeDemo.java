package com.osquare.java.designpattern.structural.facade.chap1;

import java.util.List;

public class FacadeDemo {
    public static void main(String[] args) {
        JDBCFacade jdbcFacade = new JDBCFacade();
        System.out.println("#######table created#######" + jdbcFacade.createTable());
        System.out.println("##### recored inserted#####" + jdbcFacade.insertIntoTable());
        List<Address> addressList = jdbcFacade.getAddress();
        for(Address address : addressList) {
            System.out.println(address.getId() + " | "  + address.getStreetName() + "| " + address.getCity());
        }

    }
}
