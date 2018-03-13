package main;


import java.util.stream.IntStream;

public class Table {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 9).boxed().flatMap(number1 ->
                IntStream.rangeClosed(1, 9).mapToObj(
                        number2 -> String.format("%d*%d=%d", number1, number2, number1 * number2
                        )
                )
        ).forEach(System.out::println);
    }
}