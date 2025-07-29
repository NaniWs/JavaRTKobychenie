package ru.rtk.java.Klawa;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

public class Klawa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);  // читаем один символ

        Map<Character, Character> leftMap = new HashMap<>();

        // Ряд 1
        char[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        // Ряд 2
        char[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        // Ряд 3
        char[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        // Заполняем соответствия "буква -> буква слева"
        fillLeftMap(leftMap, row1);
        fillLeftMap(leftMap, row2);
        fillLeftMap(leftMap, row3);

        // Обрабатываем замкнутые пары
        leftMap.put('a', 'p');
        leftMap.put('p', 'a');
        leftMap.put('l', 'z');
        leftMap.put('z', 'l');
        leftMap.put('m', 'q');
        leftMap.put('q', 'm');

        // Вывод результата
        if (leftMap.containsKey(input)) {
            System.out.println(leftMap.get(input));
        } else {
            System.out.println("?");
        }
    }

    // Метод для добавления соответствий из одного ряда
    private static void fillLeftMap (Map<Character, Character> map, char[] row) {
        for (int i = 0; i < row.length; i++) {
            if (i == 0) {
                map.put(row[i], row[row.length - 1]);  // замкнутость ряда
            } else {
                map.put(row[i], row[i - 1]);
            }
        }
    }

}