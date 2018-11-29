package Threads;
import java.util.concurrent.TimeUnit;

public class Potoki {

    static class SynchrTest implements Runnable {
        @Override
        public void run() {
            synchronized (Potoki.lock) {
                System.out.println("Thread  is" + Thread.currentThread().getName() + " awake");
                try {
                    Potoki.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread  is" + Thread.currentThread().getName() + " awake");

            }
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Class extends Thread");
        }
    }

    static Object lock = new Object();

    static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Class implements Thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Implements runnable");
            }
        });
        thread.start();


        for (int i = 0; i < 10; i++) {
            new Thread(new SynchrTest(), "Thread " + i).start();
        }

        for (int i = 0; i < 10; i++) {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Awake some thread");
        }



        synchronized (lock) {
            Potoki.lock.notify();
        }
    }
}
