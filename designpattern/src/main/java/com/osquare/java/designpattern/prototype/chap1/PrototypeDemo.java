package com.osquare.java.designpattern.prototype.chap1;

import java.util.ArrayList;
import java.util.List;
public class PrototypeDemo {
    public static void main(String[] args) {
        String sql = "selct * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("star wars");
        Record record = new Record();
        Statement statement = new Statement(sql, parameters,record);
        System.out.println(statement.getSql() + " | " + statement.getParameter() + " |" +
                statement.getRecord());

        Statement statement1 = statement.clone();
        System.out.println(statement.getSql() + " | " + statement.getParameter() + " |" +
                statement.getRecord());

        System.out.println("--------------------");

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("movie");
        movie.setTitle("Creational Pattern in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime() + " | " + movie.getTitle() + " | " + movie.getUrl());

        Movie movie1 = (Movie) registry.createItem("movie");
        movie1.setTitle("Gang of Four");
        System.out.println(movie1);
        System.out.println(movie1.getRuntime() + " | " + movie1.getTitle() + " | " + movie1.getUrl());

        Book book = (Book) registry.createItem("book");
        book.setTitle("Design pattern");
        System.out.println(book);
        System.out.println(book.getNumberOfPages() + " | " + book.getTitle() + " | " + book.getUrl());

        Book book1 = (Book) registry.createItem("book");
        book1.setTitle("Design pattern");
        System.out.println(book1);
        System.out.println(book.getNumberOfPages() + " | " + book1.getTitle() + " | " + book1.getUrl());
    }
}
