package com.kuang.function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<String, String> function = (a) -> {
            return a;
        };

        System.out.println(function.apply("dsad"));
    }
}
