package main;

import java.util.*;

public class Assignment2 {

    public List <Double> sequenceElements;
    public int index;
    public double e;
    public int itemCount;


    public Assignment2(double e) {
        this.e = e;
        sequenceElements = new ArrayList <>();
        itemCount = sequenceElements.size();
        compute();
    }

    public List <Double> getSequence() {
        return sequenceElements;
    }

    public int getItemCount(){
        return itemCount;
    }
       public int getIndex() {
        return index;
    }

    public void compute() {
        double a;
        for (int n = 1; true; n++) {
            a = 1 / Math.pow(n + 1, 2);
            sequenceElements.add(a);
            System.out.println("a[" + n + "]=" + a);
            if (a < e) {
                System.out.println("Наименьший элемент последовательности a[" + n + "]=" + a);
                index = n;
                itemCount=sequenceElements.size();
                break;
            }
        }
    }

    public static void main(String[] args) throws InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            Locale locale = Locale.ENGLISH;
            System.out.println("Введите граничное условие е, которое меньше или равно 0,25");
            scanner.useLocale(locale);
            double e = scanner.nextDouble();
            while (e > 0.25 || e <= 0) {

                System.out.println("Недопустимое значение е. Попробуйте ещё раз");
                scanner = new Scanner(System.in);
                locale = Locale.ENGLISH;
                scanner.useLocale(locale);
                e = scanner.nextDouble();
            }
            System.out.println("Вы ввели e = " + e);
            Assignment2 assignment2 = new Assignment2(e);
            System.out.println(assignment2.getIndex());

        } catch (InputMismatchException Scanner) {
            System.out.println("Недопустимое значение е. Попробуйте ещё раз");
            Scanner scanner = new Scanner(System.in);
            Locale locale = Locale.ENGLISH;
            scanner.useLocale(locale);
            double e = scanner.nextDouble();
            scanner = new Scanner(System.in);
            locale = Locale.ENGLISH;

            while (e > 0.25 || e <= 0) {

                System.out.println("Недопустимое значение е. Попробуйте ещё раз");
                scanner = new Scanner(System.in);
                locale = Locale.ENGLISH;
                scanner.useLocale(locale);
                e = scanner.nextDouble();

            }
            System.out.println("Вы ввели e = " + e);
            Assignment2 assignment2 = new Assignment2(e);
            System.out.println(assignment2.getIndex());


        }
    }

}






