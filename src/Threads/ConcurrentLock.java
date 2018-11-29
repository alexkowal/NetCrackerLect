package Threads;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConcurrentLock {
    public static String resource = "1";
    public static Lock lock;


    public static void main(String[] args) {
        ConcurrentLock.lock.unlock();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (ConcurrentLock.lock.tryLock(10, TimeUnit.SECONDS))
                            try {
                                System.out.println(Thread.currentThread().getName() + " got lock");
                                ConcurrentLock.resource += "1";
                                lock.lock();

                            } catch (Exception e) {
                                System.out.println("Can't lock");
                            } finally {
                                lock.unlock();
                            }
                    } catch (InterruptedException e) {
                        System.out.println("Wha");;
                    }
                }
            });
            thread.start();
        }

        System.out.println("Main finished " + Thread.currentThread().getName());

    }
}
