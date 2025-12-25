package com.jatinderaujla.techniques.arrays.oned;

import java.util.HashMap;
import java.util.Map;

public class GoodPairSum {

    /**
     * Find the indices such that they add up to target
     * @param arr given array of integer
     * @param target given target
     * @return return indices which form the sum equals to target
     */
    public int[] goodPairUsingHashMap(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public boolean goodPairSumOptimizedBruteForce(int[] arr, int target){
        boolean foundPair = false;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j <arr.length; j++){
                if(arr[i] + arr[j] == target){
                    foundPair = true;
                }
            }
        }
        return foundPair;
    }
}
