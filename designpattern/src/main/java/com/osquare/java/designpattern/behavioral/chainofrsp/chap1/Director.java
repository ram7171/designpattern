package com.osquare.java.designpattern.behavioral.chainofrsp.chap1;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conference");
        } else {
            successor.handleRequest(request);
        }
    }
}
