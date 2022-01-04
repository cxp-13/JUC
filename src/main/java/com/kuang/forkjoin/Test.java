package com.kuang.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test2();

    }

    public static void test1() throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo forkJoinDemo = new ForkJoinDemo(1l, 10_0000_0000l);
        ForkJoinTask<Long> submit = forkJoinPool.submit(forkJoinDemo);

        System.out.println(submit.get());


    }

    public static void test2() {
        long reduce = LongStream.rangeClosed(0l, 10_0000_0000l).parallel().reduce(0, Long::sum);

        System.out.println(reduce);

    }
}

