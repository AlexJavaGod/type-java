package ru.yoyo.java;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        Сумма двух чисел
//        int number = 2;
//        int number2 = 3;
//        int summa = number + number2;
//        System.out.println(summa);
//        Минусовка чисел
//        int number = 101;
//        int number2 = 100;
//        int minus = number - number2;
//        System.out.println(minus);
//        Умножение
//        int number = 101;
//        int number2 = 100;
//        int multiply = number * number2;
//        System.out.println(multiply);
//        Целочисленное деление
//        int number = 8;
//        int number2 = 3;
//        int div = number / number2;
//        System.out.println(div);
//ОСТАТОК ОТ ДЕЛЕНИЯ ЧИСЛЕННЫЙ
//        int number = 2195;
//        int number2 = 5;
//        int ostatok = number % number2;
//        System.out.println(ostatok);
//        Вещественное деление с точкой
//
//        double number = 36756;
//        double number2 = 8568;
//        double div = number / number2;
//        System.out.println(div);

//        double number3 = 4.2899159663865545;
//        double number4 = 8568;
//        double multiply = number3 * number4;
//        System.out.println(multiply);

//        Scanner in = new Scanner(System.in);
//
//        Integer a = in.nextInt();
//        Integer b = in.nextInt();
//
//        System.out.println(a + b);
//
//        if () {
//
//
//        }

//        Вывести до 10 лет ребенка
//        Парниша до 17 лет
//        Мужик до 50
//        Дед до 100
//
//else >100 древни
//        Scanner in = new Scanner(System.in);
//
//        Integer a = in.nextInt();
//        if (a < 10) {
//            System.out.println("ребенок");
//        } else if (a < 17) {
//            System.out.println("парниша");
//        } else if (a < 50) {
//            System.out.println("Мужик");
//        } else if (a < 100) {
//            System.out.println("дед");
//        } else {
//            System.out.println("древний");
//        }
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваш возраст:");
//
//        Integer a = in.nextInt();
//        if (a < 18) {
//            System.out.println("Вам нет 18 лет");
//        } else {
//            System.out.println("Прошел верификацию");
//
//        }
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш пол:");
        String s = in.next();

        if (s.equals("Мужик")) {
            System.out.println("Вы мужчина");
        } else {
            System.out.println("Вы не мужчина");
        }

    }

}
