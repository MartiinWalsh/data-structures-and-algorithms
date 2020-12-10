package com.mcodes;

public class Main {
    public static void main(String[] args) {
        int[] array = {-20, -10, 2, 5, 20, 30, 45};

        System.out.println(iterativeBinarySearch(array, 2));
        System.out.println(iterativeBinarySearch(array, -20));
        System.out.println(iterativeBinarySearch(array, 111));

        System.out.println(recursiveBinarySearch(array, 0, array.length, 2));
        System.out.println(recursiveBinarySearch(array, 0, array.length, -20));
        System.out.println(recursiveBinarySearch(array, 0, array.length, 111));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] == value) {
                return mid;
            } else if (input[mid] < value) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return -1;
        }
        int mid = (start + end) /2;

        if(input[mid] == value){
            return mid;
        }
        else if(input[mid] < value){
            return recursiveBinarySearch(input, mid +1, end, value);
        }
        else{
            return recursiveBinarySearch(input, start, mid, value);
        }
    }
}
