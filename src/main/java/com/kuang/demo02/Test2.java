package com.kuang.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        Ticket2 ticket2 = new Ticket2();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket2.grabVotes();
            }
        }, "1").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket2.grabVotes();
            }
        }, "2").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                ticket2.grabVotes();
            }
        }, "3").start();
    }
}

class Ticket2 {
    int tickets = 20;
    Lock lock = new ReentrantLock();
    public void grabVotes() {
        lock.lock();
        try {
            if (tickets > 0) {
                System.out.println(tickets-- + "-------" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
