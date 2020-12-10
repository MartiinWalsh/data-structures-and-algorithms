package com.mcodes;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {21, 32, -12, 9, 45, 1, -29};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i : intArray) {
            System.out.println(i);
        }

    }
}
