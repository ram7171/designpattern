package com.osquare.java.designpattern.structural.bridge.chap2;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2.31");
        movie.setYear("2012");

        Formatter formatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String printedDetails = moviePrinter.print(formatter);
        System.out.println(printedDetails);

        Formatter htmlFormatter = new HTMLFormatter();
        String htmlDetail = moviePrinter.print(htmlFormatter);

        System.out.println(htmlDetail);
    }
}
