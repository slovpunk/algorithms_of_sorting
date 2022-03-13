package ru.didyk.insertion_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 6, 1, 7, 8, 2, 0};

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int prev = i - 1;
            while(prev >= 0 && current < numbers[prev]) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = current;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
