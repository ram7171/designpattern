package com.osquare.java.designpattern.prototype.chap1;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();
    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.89);
        movie.setRuntime("2 hours");
        items.put("movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setNumberOfPages(787);
        book.setPrice(34.23);
        items.put("book", book);
    }
}
