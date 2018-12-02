package Threads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public static void main(String[] args) {
        AtomicInteger val = new AtomicInteger(1);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() { for(int i = 0 ; i < 100; i++) {
                val.incrementAndGet();
                System.out.println(val);
            }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 100; i++) {
                    val.incrementAndGet();
                    System.out.println(val);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
