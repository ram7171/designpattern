package com.osquare.java.designpattern.structural.decorator.chap1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorDemo1 {
    public static void main(String[] args) throws Exception {
        /*File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("this is example of decorator pattern");
        dataOutputStream.close();outputStream.close();*/

        Sandwich sandwich = new DressDecortor(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

    }
}
