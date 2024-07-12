package com.jatinderaujla.techniques.prefixsum;

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

}
