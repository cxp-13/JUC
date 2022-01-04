package com.kuang.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo extends RecursiveTask<Long> {
    Long start;
    Long end;

    Long temp = 10000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start > temp) {
            Long sum = 0l;
            for (Long i = start; i < end; i++) {
                sum += i;
            }
            return sum;
        } else {

            long middle = (end + start) / 2;
            ForkJoinDemo forkJoinDemo = new ForkJoinDemo(start, middle);
            forkJoinDemo.fork();
            ForkJoinDemo forkJoinDemo1 = new ForkJoinDemo(middle + 1, end);
            forkJoinDemo1.fork();

            return forkJoinDemo.join()+forkJoinDemo1.join();
        }
    }
}
