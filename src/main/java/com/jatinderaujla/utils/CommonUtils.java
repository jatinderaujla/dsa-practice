package com.jatinderaujla.utils;

public final class CommonUtils {

    public static int[] prefixSumArr(int[] arr) {
        int[] prefixSumArr = new int[arr.length];
        prefixSumArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
        }

        return prefixSumArr;
    }

    public static int[] prefixSumArr(int[] arr, boolean oddIndices) {
        int[] prefixSumArr = new int[arr.length];

        if (oddIndices) {
            prefixSumArr[0] = 0; //because 0th index is even index for odd indices
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 != 0) {
                    prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
                } else {
                    prefixSumArr[i] = prefixSumArr[i - 1];
                }
            }
        } else {
            prefixSumArr[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 == 0) {
                    prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
                } else {
                    prefixSumArr[i] = prefixSumArr[i - 1];
                }
            }
        }

        return prefixSumArr;
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
