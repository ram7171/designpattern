package com.osquare.java.designpattern.factory.chap1;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }
    public List<Page> getPages() {
        return pages;
    }
    protected abstract void createWebsite();

}
