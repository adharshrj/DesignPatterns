package com.javabasics;

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Adharsh");
        System.out.println(user.name);
        user.sayHello();
    }
}
 