package ru.didyk.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {4, 99, 2, 6, 1, 0, 9};

        for (int i = 0; i < numbers.length; i++) {
            int val = i;
            for (int j = i; j < numbers.length; j++) {
                if(numbers[j] < numbers[val]) {
                    val = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[val];
            numbers[val] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
