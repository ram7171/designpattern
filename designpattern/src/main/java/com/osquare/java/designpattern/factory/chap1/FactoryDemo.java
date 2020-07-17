package com.osquare.java.designpattern.factory.chap1;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");

        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite("shop");
        System.out.println(site.getPages());
    }
}
