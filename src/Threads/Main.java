package Threads;
import javafx.concurrent.Task;

import java.util.Timer;
import java.util.TimerTask;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 4 * 1000, 2 * 100);
        TimeUnit.SECONDS.sleep(10);
        timer.cancel();
    }
}
