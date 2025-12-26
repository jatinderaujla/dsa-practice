package com.jatinderaujla.techniques.arrays.oned;

import com.jatinderaujla.utils.CommonUtils;

public class ReverseRotateArray {

    public int[] reverseArray(int[] arr) {
        return reverseArrayInRange(arr, 0, arr.length - 1);
    }

    public int[] reverseArrayInRange(int[] arr, int start, int end) {
        while (start < end) {
            CommonUtils.swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    public int[] rotateArrayKTimes(int[] arr, int k) {
        if(k > arr.length){
            k = k % arr.length;
        }
        reverseArray(arr);
        reverseArrayInRange(arr, 0, k - 1);
        reverseArrayInRange(arr, k, arr.length - 1);
        return arr;
    }

}
