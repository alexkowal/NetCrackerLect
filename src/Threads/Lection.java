package Threads;

import java.util.*;

import static java.lang.Thread.sleep;

public class Lection {


    public static void main(String[] args) {

        Collection<String> list =  Collections.synchronizedCollection(new ArrayList<>());
        for (int i = 0; i < 1000; i++)
            list.add("" + i);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.remove(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } } }});
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<String> iter = list.iterator();
                while (iter.hasNext()){
                    System.out.println("iterator run " + iter.next());

                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}
        });

        thread1.start();
        thread2.start();
    }
}
