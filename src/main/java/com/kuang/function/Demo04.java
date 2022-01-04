package com.kuang.function;

import java.util.function.Supplier;

public class Demo04 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "ewr";
        };

        System.out.println(supplier.get());
    }
}
