package com.kuang.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> objects = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                objects.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(objects);
            }, String.valueOf(i)).start();
        }
    }
}
