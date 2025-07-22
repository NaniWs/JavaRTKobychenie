package ru.rtk.java.Homework1;

public class Main2 {
    public static void main(String[] args) {  // Исправлено на main
        doSomething();
        String s = returnSomeString();
        System.out.println(s);
    }

    public static void doSomething() {
        System.out.println("do something");
    }

    public static String returnSomeString() {  // Исправлено название
        System.out.println("returning string");
        return "Hello, World!";  // Добавлен return
    }
}