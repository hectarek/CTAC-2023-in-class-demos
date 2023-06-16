package org.example;

public class Main {
    public static void main(String[] args) {

        // Thread + Runnable

        // Create a Runnable object. This is the task your thread will run.
        Runnable myRunnable = new Runnable() {
            public void run() {
                System.out.println("Hello from the new thread!");
            }
        };

        // Create a new Thread object using your Runnable
        Thread myThread = new Thread(myRunnable);

        // Start the new thread
        myThread.start();

        // Extending Thread Class

        public class MyThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello from MyThread " + i);
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                MyThread myThread = new MyThread();
                myThread.start();
            }
        }

        // Interrupt Method

        Thread myThread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(10000); // Try to sleep for 10 seconds
                } catch (InterruptedException e) {
                    System.out.println("The thread was interrupted!");
                }
            }
        });

        myThread.start(); // Start the new thread
        myThread.interrupt(); // Interrupt the new thread


        // Interrupt Method for Loop

        Thread myThread = new Thread(new Runnable() {
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    // Perform computation...

                    // If the computation is no longer needed,
                    // the thread will be interrupted and the loop will stop
                }
            }
        });

        myThread.start(); // Start the thread

        // Later, when the result is no longer needed...
        myThread.interrupt(); // Interrupt the thread

        // Join Method

        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello from the new thread!");
            }
        });

        myThread.start(); // Start the new thread

        try {
            myThread.join(); // Wait for the new thread to finish
        } catch (InterruptedException e) {
            System.out.println("The current thread was interrupted!");
        }

        System.out.println("The new thread has finished executing!");

        // Join for Dependency Between Threads **********

        Thread firstThread = new Thread(new Runnable() {
            public void run() {
                // Perform a computation...
                System.out.println("First thread finished its task!");
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            public void run() {
                // Perform another computation...
                System.out.println("Second thread finished its task!");
            }
        });

        firstThread.start(); // Start the first thread

        try {
            firstThread.join(); // Wait for the first thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        secondThread.start(); // Start the second thread after the first has finished

        //  Local Variable **********

        public void myMethod() {
            int myLocalVariable = 42; // This is a local variable
            // Each thread gets its own copy of myLocalVariable
        }

        // Thread-Local Variable **********

        // Create a ThreadLocal variable
        ThreadLocal<String> threadId = new ThreadLocal<>();

        // Define the task that will be run in each thread
        Runnable myRunnable = new Runnable() {
            public void run() {
                // Set a unique ID for each thread
                threadId.set(Thread.currentThread().getName());

                // Now we can retrieve this unique ID from anywhere within the same thread
                System.out.println("Hello from thread: " + threadId.get());
            }
        };

        // Now we'll create two separate threads, each with its own unique ID
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();


        // Deadlocks **********

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

    // Synchronization  **********

        public class Counter {
            private int count = 0;

            public void increment() {
                synchronized (this) {
                    count++;
                }
            }

            public int getCount() {
                synchronized (this) {
                    return count;
                }
            }
        }

        // wait() and notifyAll() Methods **********

        class SharedResource {
            private boolean isReady = false;

            public synchronized void waitForReady() throws InterruptedException {
                while (!isReady) {
                    wait();
                }
            }

            public synchronized void setReady() {
                isReady = true;
                notifyAll();
            }
        }

        // Usage:
        SharedResource resource = new SharedResource();

        // Thread 1
        new Thread(() -> {
            try {
                resource.waitForReady();
                System.out.println("Thread 1: Resource is ready!");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            resource.setReady();
            System.out.println("Thread 2: Resource has been set to ready!");
        }).start();


        // ******** Thread Pools **********

        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;

        public class ThreadPoolExample {
            public static void main(String[] args) {
                // Create a thread pool with 10 threads
                ExecutorService executor = Executors.newFixedThreadPool(10);

                // Submit tasks to the thread pool
                for (int i = 0; i < 50; i++) {
                    final int taskNumber = i;
                    executor.submit(() -> {
                        System.out.println("Running task " + taskNumber + " in thread " + Thread.currentThread().getName());
                    });
                }

                // Don't forget to shut down the executor when you're done!
                executor.shutdown();
            }
        }

    }
}