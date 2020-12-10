package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {3, 6, 7, 2, 7, 8, 3, 10};

        countingSort(intArray, 1, 10);

        for (int item : intArray) {
            System.out.println(item);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            //Where to increment value in count array
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while ((countArray[i - min] > 0)
            ) {
                input[j++] = i;
                countArray[i - min]--;

            }
        }

    }
}
