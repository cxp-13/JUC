package com.kuang.pool;

import java.awt.desktop.AboutHandler;
import java.util.concurrent.*;

public class Demo01 {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
//        ExecutorService threadPool = Executors.newCachedThreadPool();
        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 5, 3, TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(3), new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 1; i <= 9; i++) {
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "  ok");
            });
        }
        threadPool.shutdown();

    }
}
