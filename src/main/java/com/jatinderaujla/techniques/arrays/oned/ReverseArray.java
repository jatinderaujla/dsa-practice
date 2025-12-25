package com.jatinderaujla.techniques.arrays.oned;

import com.jatinderaujla.utils.CommonUtils;

public class ReverseArray {

    public int[] reverseArray(int[] arr){
        return reverseArrayInRange(arr, 0, arr.length-1);
    }

    public int[] reverseArrayInRange(int[] arr, int start, int end){
        while(start < end){
            CommonUtils.swap(arr, start,end);
            start++;
            end--;
        }
        return arr;
    }

}
