package ru.meryakubov;

public class JavaBasicsLesson {
    public static void main(String[] args) {

        // 0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        boolean isTrue = true;
        boolean isFalse = false;
        byte a = -128;
        byte b = 127;
        short a = -32768;
        short b = 32767;
        int a = -2147483648;
        int b = 2147483647;
        long a = –9223372036854775808;
        long b = 9223372036854775807;
        float a = 8.5F;
        float b = -3.2F;
        double a = 8.5;
        double b = -3.2;
        char a = 'a';
        String name = "Aleksey";

        // 1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)

        // математические операторы
        int a = 30;
        int b = 20;
        int c = 35;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (a / b));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (--a));

        //логические операторы
        boolean a = true;
        boolean b;
        b = a || true; // b истинно
        b = !b; // b ложно
        System.out.println(b); // выведет false
        a = a || b; // a истинно
        boolean c;
        c = a && (a||b); //с истинно
        System.out.println(c); // выведет true

        // добиться переполнения
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));

        // 2) попробовать вычисления комбинаций типов данных (int и double)

        int intValue = 1;
        double doubleValue = 1.005;

        System.out.println(intValue == doubleValue);
        System.out.println(intValue + doubleValue);
        System.out.println(intValue * doubleValue);
        System.out.println(intValue / doubleValue);
        System.out.println(intValue - doubleValue);
    }
}