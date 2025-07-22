package ru.rtk.java.Homework2;

import java.util.Scanner;

public class Main1 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName);
        scanner.close();
    }
}