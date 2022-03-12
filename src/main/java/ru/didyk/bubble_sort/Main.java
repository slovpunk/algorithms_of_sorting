package ru.didyk.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 1, 0, 7, 5};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
