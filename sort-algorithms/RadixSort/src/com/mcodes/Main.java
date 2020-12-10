package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int item : radixArray) {
            System.out.println(item);
        }
    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        // How many values have a specific value at the position being looked at
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Below are extra steps to make it a stable sort
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }


        int[] temp = new int[numItems];
        // Write the values into a temporary array
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        // Copy temp array back into input array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        // Returns the digit for each position
        return value / (int) Math.pow(radix, position) % radix;
    }
}

