package com.kuang.bq;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue<String> objects = new SynchronousQueue<>();
        new Thread(()->{

            try {
                System.out.println(Thread.currentThread().getName()+"put 1");
                objects.put("1");
                System.out.println(Thread.currentThread().getName()+"put 2");
                objects.put("2");
                System.out.println(Thread.currentThread().getName()+"put 3");
                objects.put("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"T1").start();

        new Thread(()->{

            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName()+objects.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName()+objects.take());
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName()+objects.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"T2").start();
    }
}
