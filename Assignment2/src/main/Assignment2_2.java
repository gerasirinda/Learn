package main;

import java.util.Locale;
import java.util.Scanner;

public class Assignment2_2 {

    public int index;
    public static double e = Double.MIN_VALUE;

    public Assignment2_2(double e) {
        Assignment2_2.e = e;
        compute();
    }

    public int getIndex() {
        return index;
    }

    public void compute() {
        int n = 0;
        double a;
        do {
            n++;
            a = 1 / Math.pow(n + 1, 2);
            System.out.println("a[" + n + "]=" + a);

            index = n;

        } while (a > e);
        System.out.println("Наименьший элемент последовательности a[" + n + "]=" + a);


    }

    public static void main(String[] args) {
        System.out.println("Введите граничное условие е, которое меньше или равно 0,25");
        Scanner scanner = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scanner.useLocale(locale);

        do {

            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Недопустимое значение е. Попробуйте ещё раз");

            }
            if (e != Double.MIN_VALUE) {
                System.out.println("Недопустимое значение е. Попробуйте ещё раз");

            }
            e = scanner.nextDouble();

        } while (e > 0.25 || e <= 0);

        System.out.println("Вы ввели e = " + e);
        Assignment2_2 assignment2_2 = new Assignment2_2(e);
        System.out.println(assignment2_2.getIndex());
    }
}








