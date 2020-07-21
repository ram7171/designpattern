package com.osquare.java.designpattern.structural.facade.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class EveryDayDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http","www.pluralsight.com", 80, "/author/bryan-hansen");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        System.out.println(in.readLine());
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }
}
