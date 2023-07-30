package ru.meryakubov;

public class JavaBasicsLesson {
    public static void main(String[] args) {

        // 0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        boolean isTrue = true;
        boolean isFalse = false;
        byte a = -128;
        byte b = 127;
        short c = -32768;
        short d = 32767;
        int e = -2147483648;
        int f = 2147483647;
        long g = -9223372036854775808L;
        long h = 9223372036854775807L;
        float i = 8.5F;
        float j = -3.2F;
        double k = 8.5;
        double l = -3.2;
        char m = 'a';
        String name = "Aleksey";

        // 1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)

        // математические операторы
        int n = 30;
        int o = 20;
        int p = 35;

        System.out.println("n + o = " + (n + o));
        System.out.println("n - o = " + (n - o));
        System.out.println("n * o = " + (n * o));
        System.out.println("o / n = " + (n / o));
        System.out.println("o % n = " + (b % a));
        System.out.println("p % n = " + (p % n));
        System.out.println("n++   = " +  (n++));
        System.out.println("o--   = " +  (--n));

        //логические операторы
        boolean q = true;
        boolean r;
        r = q || true; // r истинно
        r = !r; // r ложно
        System.out.println(b); // выведет false
        q = q || r; // a истинно
        boolean s;
        s = q && (q||r); //с истинно
        System.out.println(s); // выведет true

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