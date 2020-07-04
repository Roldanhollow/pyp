package com.pyp.basics;

import java.util.Arrays;

public class FizzBuzz {
    /**
     * Escribir un programa que dado un arrays de números retorne:
     * - "Fizz" si el número es multiplo de 3
     * - "Buzz" si el número es multiplo de 5
     * - "FizzBuzz" si el número es divisible por 3 y 5, sino devuelve el número
     *
     */

    public static void main(String[] args) {
        Integer[] numbers = {5,8,10,15,48};
        fizzBuzz(numbers);
    }

    private static void fizzBuzz(Integer[] numbers) {
        Arrays.stream(numbers).forEach(number -> {
            boolean mult3 = number % 3 == 0;
            boolean mult5 = number % 5 == 0;
            boolean mult3_5 = mult3 && mult5;
            if (mult3_5)
                System.out.println("FizzBuzz");
            else if (mult3)
                System.out.println("Fizz");
            else if (mult5)
                System.out.println("Buzz");
            else
                System.out.println(number);
        });
    }
}
