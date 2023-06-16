package org.example;

public class Erin {
    public static void main(String[] args) {
        // These are the two resources that the threads will try to lock
        Object resourceA = new Object();
        Object resourceB = new Object();

        // This is the first thread
        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: locked resource A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) { }

                synchronized (resourceB) {
                    System.out.println("Thread 1: locked resource B");
                }
            }
        });

        // This is the second thread
        Thread thread2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: locked resource B");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) { }

                synchronized (resourceA) {
                    System.out.println("Thread 2: locked resource A");
                }
            }
        });

        // Start the two threads
        thread1.start();
        thread2.start();
    }
}
