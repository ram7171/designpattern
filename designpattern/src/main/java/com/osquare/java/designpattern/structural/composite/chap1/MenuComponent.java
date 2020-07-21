package com.osquare.java.designpattern.structural.composite.chap1;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(":");builder.append(url + "\n");
        return builder.toString();
    }

    public MenuComponent add(MenuComponent component) {
        throw new UnsupportedOperationException("feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent component) {
        throw new UnsupportedOperationException("feature not implemented at this level");
    }

}
