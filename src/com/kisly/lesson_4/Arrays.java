package com.kisly.lesson_4;

public class Arrays {
    public static void main(String[] args) {

        int[] array = {19, 6, 2, 3, 8, 5, 1};
        int maxElementIndex = 0;
        int minElementIndex = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[maxElementIndex] < array[i]) {
                maxElementIndex = i;
            }
            if (array[minElementIndex] > array[i]) {
                minElementIndex = i;
            }
        }
        System.out.println(minElementIndex);
        System.out.println(maxElementIndex);

    }
}
