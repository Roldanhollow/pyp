package com.pyp.basics;

public class PrintArrayWithoutForLoopsConditional {
    //Imprimir los valores de un array sin usar condicionales for-loop
    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "d", "e" };
        int counter = 0;
        printArrayValue(array, counter);
    }

    private static void printArrayValue(String[] array, int counter) {
        if (counter < array.length) {
            System.out.println(array[counter]);
            counter++;
            printArrayValue(array, counter);
        }
    }


}
