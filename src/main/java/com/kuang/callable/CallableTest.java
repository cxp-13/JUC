package com.kuang.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        new Thread().start();

        MyThread myThread = new MyThread();
        FutureTask stringFutureTask = new FutureTask(myThread);

        new Thread(stringFutureTask,"A").start();
        Integer o = (Integer) stringFutureTask.get();
        System.out.println(o);
    }
}

class MyThread implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("call()11");
        return 123;
    }
}
