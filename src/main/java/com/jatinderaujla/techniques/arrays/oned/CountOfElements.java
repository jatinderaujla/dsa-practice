package com.jatinderaujla.techniques.arrays.oned;

public class CountOfElements {

    /**
     * Count the no of elements that have at least 1 element greater than itself.
     * @param arr input array of integer
     * @return count of elements that have at least 1 element greater than itself.
     */
    public int countOfElements(int[] arr){
        int maxElement = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == maxElement){
                count++;
            }
        }

        return arr.length - count;
    }

    public int countOfElementsSingleLoop(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        int countOfMaxEl = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                countOfMaxEl = 1;
            } else if(arr[i] == maxElement){
                countOfMaxEl++;
            }
        }
        return arr.length - countOfMaxEl;
    }

    public int countOfElementsBruteForce(int[] arr){
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            boolean hasGreaterEl = false;
            for(int j = 0; j < arr.length; j++){
                if(i!=j && arr[i] < arr[j]){
                    hasGreaterEl = true;
                }
            }
            if(hasGreaterEl){
                count++;
            }
        }
        return count;
    }
}
