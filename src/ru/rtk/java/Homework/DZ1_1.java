package ru.rtk.java.Homework;

import java.util.Random;

public class DZ1_1 {
    public static void main(String[] args) {
        Random random = new Random();

        // Обозначения: 0 - Камень, 1 - Ножницы, 2 - Бумага
        int vasyaChoice = random.nextInt(3);
        int petyaChoice = random.nextInt(3);

        String[] choices = {"Камень", "Ножницы", "Бумага"};

        System.out.println("Вася выбрал: " + choices[vasyaChoice]);
        System.out.println("Петя выбрал: " + choices[petyaChoice]);

        // Определение победителя
        if (vasyaChoice == petyaChoice) {
            System.out.println("Ничья!");
        } else if (
                (vasyaChoice == 0 && petyaChoice == 1) || // Камень бьет ножницы
                        (vasyaChoice == 1 && petyaChoice == 2) || // Ножницы бьют бумагу
                        (vasyaChoice == 2 && petyaChoice == 0)    // Бумага бьет камень
        ) {
            System.out.println("Вася выиграл!");
        } else {
            System.out.println("Петя выиграл!");
        }
    }
}