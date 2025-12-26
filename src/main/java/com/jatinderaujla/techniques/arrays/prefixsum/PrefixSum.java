package com.jatinderaujla.techniques.arrays.prefixsum;

import com.jatinderaujla.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum {

    /**
     * Given an array need to find the sum for each queries in given range.
     * But only for <b>odd indices</b>
     *
     * @param arr     given array
     * @param queries range from which need to find sum
     * @return queries sum list
     */
    public int[] oddIndicesSum(int[] arr, int[][] queries) {
        int[] prefixArr = CommonUtils.prefixSumArr(arr, true);
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int val = prefixArr[queries[i][1]];
            if (queries[i][0] > 0) {
                val = val - prefixArr[queries[i][0] - 1];
            }
            ans[i] = val;
        }
        return ans;
    }

    /**
     * Given an array need to find the sum for each queries in given range.
     * But only for <b>even indices</b>
     *
     * @param arr     given array
     * @param queries range from which need to find sum
     * @return queries sum list
     */
    public int[] evenIndicesSum(int[] arr, int[][] queries) {
        int[] prefixArr = CommonUtils.prefixSumArr(arr, false);
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int val = prefixArr[queries[i][1]];
            if (queries[i][0] > 0) {
                val = val - prefixArr[queries[i][0] - 1];
            }
            ans[i] = val;
        }
        return ans;
    }


    /**
     * Given an array range and find the sum between given range of the array
     * let say array given array is [1,2,3,4,5]
     * let say range 2d array is [[1,3], [3,4], [0,4]]
     * so if we take first range [1,3] this say find the sum from 1st index to 3rd index in given array
     * 1 to 3rd index sum should be 10
     *
     * @param arr     given array
     * @param queries range queries
     * @return list of sum for each queries
     */
    public List<Long> rangeSum(int[] arr, int[][] queries) {
        //create a prefix sum array of arr
        int[] prefixSum = CommonUtils.prefixSumArr(arr);

        List<Long> rangeSums = new ArrayList<>(queries.length);
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                rangeSums.add((long) prefixSum[right]);
            } else {
                rangeSums.add((long) (prefixSum[right] - prefixSum[left - 1]));
            }
        }
        return rangeSums;
    }

    /**
     * Given an array range and find the sum between given range of the array
     * let say array given array is [1,2,3,4,5]
     * let say range 2d array is [[1,3], [3,4], [0,4]]
     * so if we take first range [1,3] this say find the sum from 1st index to 3rd index in given array
     * 1 to 3rd index sum should be 10
     *
     * @param arr     given array
     * @param queries range queries
     * @return list of sum for each queries
     */
    public int[] rangeSumBruteForce(int[] arr, int[][] queries) {

        int[] rangeSums = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int sum = 0;
            for(int j = left; j <= right; j++){
                sum += arr[j];
            }
            rangeSums[i] = sum;
        }
        return rangeSums;
    }

    /**
     * Find the equilibrium index of a given array
     * <b>Equilibrium</b> index is if all the lower index sum and higher index sum are equals then index is equilibrium
     * @param arr given array of size n
     * @return index minimum index if more than one equilibrium index else return -1 if not found
     */
    public int minEquilibriumIndex(int[] arr){
        int[] prefixSum = CommonUtils.prefixSumArr(arr);

        for (int i = 0; i < arr.length; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i-1];
            int rightSum = prefixSum[arr.length -1] - prefixSum[i];
            if(leftSum == rightSum){
                return i;
            }
        }

        return  -1;
    }
}
