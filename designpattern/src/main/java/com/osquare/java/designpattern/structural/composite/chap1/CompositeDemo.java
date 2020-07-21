package com.osquare.java.designpattern.structural.composite.chap1;

public class CompositeDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem item = new MenuItem("Safety", "/safety");
        mainMenu.add(item);
        item = new MenuItem("Claim", "/claim");
        mainMenu.add(item);

        MenuItem personalClaimMenu = new MenuItem("Personal claim", "/personalClaims");
        mainMenu.add(personalClaimMenu);

        System.out.println(mainMenu.toString());
    }
}
