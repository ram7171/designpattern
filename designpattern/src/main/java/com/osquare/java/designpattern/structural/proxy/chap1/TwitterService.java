package com.osquare.java.designpattern.structural.proxy.chap1;

public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
