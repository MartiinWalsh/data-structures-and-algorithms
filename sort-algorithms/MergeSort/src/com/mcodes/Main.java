package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {21, 32, -12, 9, 45, 1, -29};

        mergeSort(intArray, 0, intArray.length);



        for (int item : intArray) {
            System.out.println(item);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        // End if it is a one element array
        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        //merge left partition
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);


    }

    public static void merge(int[] input, int start, int mid, int end){
        // If true the array is already sorted
        if(input[mid -1 ] <= input[mid]){
            return;
        }

        int i = start;
        int j= mid;
        // Track position in temporary array
        int tempIndex = 0;

        int[] temp = new int [end-start];
        // if i < mid the left array has been traversed
        // if j < mid the right array has been traversed
        while( i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // If we have finished traversing the left array, we don't need to worry about left over values in the right
        // array as their positions in the original array will not change
        // But if there are remaining values in the left array they must be copied over into the temp array

        // If there are no elements left over in the left array this wont do anytghing
        // If there are elements left, they are being copied to the end of the input array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copying the temp array up to temp index, into the input array
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
