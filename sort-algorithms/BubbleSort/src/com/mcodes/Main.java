package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {21, 32, -12, 9, 45, 1, -29};

        for(int index = intArray.length -1; index > 0; index--){
            for(int i = 0; i < index; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for (int item : intArray) {
            System.out.println(item);
        }
        
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
