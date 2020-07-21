package com.osquare.java.designpattern.structural.proxy.chap1;

public class ProxyDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(service.getTimeline("defalt"));

        service.postToTimeline("bhk3", "some message should not be read");
    }
}
