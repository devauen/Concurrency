package com.proartz;

public class Concurrency extends Thread {

    public void run() {
        System.out.println("Hello from the thread!");
    }

    public static void main(String[] args) {
        (new Concurrency()).start();
    }
}