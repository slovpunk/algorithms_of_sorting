package ru.didyk.merge_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {6, 3, 4, 5, 1, 0, 3};
        mergeSort(numbers, numbers.length);
        System.out.println(Arrays.toString(numbers));
    }

    public static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }

        int middleOfArray = length / 2;
        int[] leftPart = new int[middleOfArray];
        int[] rightPart = new int[length - middleOfArray];

        for (int i = 0; i < leftPart.length; i++) {
            leftPart[i] = array[i];
        }

        for (int i = middleOfArray; i < length; i++) {
            rightPart[i - middleOfArray] = array[i];
        }

        mergeSort(leftPart, middleOfArray);
        mergeSort(rightPart, length - middleOfArray);
        merge(array, leftPart, rightPart, middleOfArray, length - middleOfArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}
