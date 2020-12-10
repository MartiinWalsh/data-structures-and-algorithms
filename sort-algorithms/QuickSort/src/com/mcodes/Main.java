package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {21, 32, -12, 9, 45, 1, -29};

        quickSort(intArray, 0, intArray.length);

        for (int item : intArray) {
            System.out.println(item);
        }
    }

    public static void quickSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input,start, pivotIndex);
        quickSort(input,  pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end){
        //Using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){
            // Will end when the first element less than the pivot is found or i < j
            while (i < j && input[--j] >=pivot);
            // In case loop stopped because i < j
            if(i < j){
                // Element less than pivot j, therefore move element at j into i
                input[i] = input[j];
            }

            // Then check i, left side of partition
            while (i < j && input[++i] <=pivot);

            if(i < j){
                // Element less than pivot j, therefore move element at j into i
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        //The index where pivot was inserted
        return j;

    }
}
