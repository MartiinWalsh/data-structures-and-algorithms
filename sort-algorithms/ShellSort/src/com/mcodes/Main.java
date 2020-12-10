package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {21, 32, -12, 9, 45, 1, -29};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -=gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int item : intArray) {
            System.out.println(item);
        }

    }
}
