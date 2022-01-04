package com.kuang.bq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class Test {
    public static void main(String[] args) {
        test2();

    }

    public static void test1(){
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.add("a"));
        System.out.println(arrayBlockingQueue.element());
        System.out.println(arrayBlockingQueue.remove());

    }

    public static void test2(){
        ArrayBlockingQueue<Object> objects = new ArrayBlockingQueue<>(3);

        System.out.println(objects.offer("a"));
        System.out.println(objects.offer("b"));
        System.out.println(objects.offer("c"));
        System.out.println(objects.poll());
        System.out.println(objects.peek());
    }
}
