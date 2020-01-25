package ru.Eltex;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory before: " + runtime.totalMemory());
        System.out.println("Free memory before: " + runtime.freeMemory());

        for(int i = 0; i < 1_000_000; i++) {
            Date date = new Date();
            date = null;
        }

        System.out.println("Total memory after: " + runtime.totalMemory());
        System.out.println("Free memory after: " + runtime.freeMemory());

        System.gc();
        Thread.currentThread().sleep(100);
        System.out.println("Total memory before gc: " + runtime.totalMemory());
        System.out.println("Free memory before gc: " + runtime.freeMemory());

    }
}

