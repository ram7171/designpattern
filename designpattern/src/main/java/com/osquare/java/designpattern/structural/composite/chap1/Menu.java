package com.osquare.java.designpattern.structural.composite.chap1;

import com.osquare.java.designpattern.structural.flyweight.chap1.Item;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }

    public MenuComponent add(MenuComponent component) {
        menuComponents.add(component);
        return component;
    }

    public MenuComponent remove(MenuComponent component) {
        menuComponents.remove(component);
        return component;
    }
}
