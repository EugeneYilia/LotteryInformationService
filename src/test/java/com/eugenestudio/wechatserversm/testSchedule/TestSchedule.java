package com.eugenestudio.wechatserversm.testSchedule;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestSchedule {

    //1. review db
    //2. time job
    //3. jvm
    //4. vue chat page

    public static void timer1() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, 2000);// 设定指定的时间time,此处为2000毫秒
    }

//    public static int count = 0;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                //count++;
                //System.out.println("Hello !!" + count);
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 30, TimeUnit.MINUTES);
        //service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
    }

   /* public static void main(String[] args) {
        timer1();
    }*/
}
