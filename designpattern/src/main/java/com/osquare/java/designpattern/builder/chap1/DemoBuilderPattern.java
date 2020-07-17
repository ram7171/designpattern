package com.osquare.java.designpattern.builder.chap1;

public class DemoBuilderPattern {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Moyo").meat("chicken");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread() + "\n" + lunchOrder.getCondiments() + "\n"
                +lunchOrder.getDressing() + " \n" + lunchOrder.getMeat());

    }
}
