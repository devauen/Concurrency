package com.proartz;

public class Concurrency {

    public static void main(String[] args) throws InterruptedException {

        String[] words = {
                "Test me i'm a thread",
                "I'm going to sleep",
                "In my sweet thread bad",
                "Let it be, let."
        };

        for(int i = 0; i < words.length; i++ ) {
            something(words[i]);
            if(Thread.interrupted()) {
                return;
            }
        }
    }

    public static void something(String word) throws InterruptedException{
        Thread.sleep(4000);
        System.out.println(word);
    }
}