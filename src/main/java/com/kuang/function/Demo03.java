package com.kuang.function;

import java.util.function.Consumer;

public class Demo03 {
    public static void main(String[] args) {
        Consumer<String> consumer = (str)->{
//            System.out.println(str);
//            return str;
        };

        consumer.accept("Dasd");
    }
}
