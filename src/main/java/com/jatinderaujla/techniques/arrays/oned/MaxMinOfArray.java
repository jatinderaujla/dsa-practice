package com.jatinderaujla.techniques.arrays.oned;

import java.util.Arrays;

public class MaxMinOfArray {

    public int findMaxElementOfArrayUsingSort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public int findMaxElementOfArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int findMinElementOfArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int findSecondMaxElementOfArray(int[] arr){
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public int findSecondMinElementOfArray(int[] arr){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if(arr[i] < secondMin && arr[i] > min){
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
}
