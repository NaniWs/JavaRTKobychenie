package ru.rtk.java.Homework;

import java.util.Scanner;

public class DZ1 {
    public static void DZ1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
        scanner.close();
    }
}
