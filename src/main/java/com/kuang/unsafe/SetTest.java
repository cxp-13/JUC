package com.kuang.unsafe;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetTest {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        for (int i = 1; i <= 60; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(set);
            }, String.valueOf(i)).start();
        }


    }
}
