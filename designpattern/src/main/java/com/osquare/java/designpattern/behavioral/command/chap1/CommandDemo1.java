package com.osquare.java.designpattern.behavioral.command.chap1;

public class CommandDemo1 {
    public static void main(String[] args) {
        Task t1 = new Task(10, 12);
        Task t2 = new Task(30, 12);

        Thread thread1 = new Thread(t1);
        thread1.start();

        Thread thread2 = new Thread(t2);
        thread2.start();
    }

    private static class Task implements Runnable{
        int num1; int num2;
        Task(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() {
            System.out.println(num1 + num2);
        }
    }
}
