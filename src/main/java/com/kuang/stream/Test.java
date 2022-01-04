package com.kuang.stream;

import java.util.ArrayList;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        User a = new User(1, "a", 21);
        User b = new User(2, "b", 22);
        User c = new User(3, "c", 23);
        User d = new User(4, "d", 24);
        User e = new User(5, "e", 25);

        ArrayList<User> users = new ArrayList<>();
        users.add(a);
        users.add(b);
        users.add(c);
        users.add(d);
        users.add(e);


//        1,id是整数
//        users.stream().filter((user) -> {
//            return (user.getId() % 2 == 0);
//        }).forEach(System.out::println);
//        age大于23
//        users.stream().filter((user) -> {
//            return (user.getAge() > 23);
//        }).forEach(System.out::println);
// name转化大写
//        users.stream().map((user) -> {
//            user.setName(user.getName().toUpperCase());
//            return user;
//        }).forEach(System.out::println);
// name倒着排序
//        users.stream().sorted((u1, u2) -> {
//            return Integer.valueOf(u2.getName().charAt(0)) - Integer.valueOf(u1.getName().charAt(0));
//        }).forEach(System.out::println);

        users.stream().map((user)->{
           return user.getName().toUpperCase();})
                        .sorted((u1, u2) -> {
                    return u2.compareTo(u1);
                }).forEach(System.out::println);
//        只输出一个用户
//        users.stream().limit(1).forEach(System.out::println);

    }
}
