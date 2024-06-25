package com.jatinderaujla.sorting;

import com.jatinderaujla.utils.CommonUtils;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    CommonUtils.swap(arr, i, j);
                }
            }
        }
    }

}
