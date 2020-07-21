package com.osquare.java.designpattern.structural.proxy.chap1;

public class TwitterServiceImpl implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}
