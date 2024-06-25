package com.jatinderaujla.prefixsum;

import com.jatinderaujla.utils.CommonUtils;

public class PrefixSum {
    public int[] oddIndicesSum(int[] arr, int[][] queries){
        int[] prefixArr = CommonUtils.prefixSumArr(arr, true);
        int[] ans = new int[queries.length];

        for (int i=0; i< queries.length; i++) {
            int val = prefixArr[queries[i][1]];
            if(queries[i][0] > 0){
                val = val - prefixArr[queries[i][0]-1];
            }
            ans[i] = val;
        }
        return ans;
    }

    public int[] evenIndicesSum(int[] arr, int[][] queries){
        int[] prefixArr = CommonUtils.prefixSumArr(arr, false);
        int[] ans = new int[queries.length];

        for (int i=0; i< queries.length; i++) {
            int val = prefixArr[queries[i][1]];
            if(queries[i][0] > 0){
                val = val - prefixArr[queries[i][0]-1];
            }
            ans[i] = val;
        }
        return ans;
    }

}
