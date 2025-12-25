package com.jatinderaujla.techniques.arrays.subarray;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    /**
     * Create a sub array with in given range
     *
     * @param arr given array
     * @param s   starting range value
     * @param e   ending range value
     * @return array
     */
    public int[] findSubArrayInGivenRange(int[] arr, int s, int e) {
        int[] subArr = new int[e - s];
        int count = 0;
        for (int i = s; i <= e; i++) {
            subArr[count++] = arr[i];
        }
        return subArr;
    }

    /**
     * Find the maximum sub array sum such that sum must not exceed b.
     *
     * @param arr given array
     * @param b   sum cannot be more than b
     * @return maximum sum
     */
    public int maximumSubArraySum(int[] arr, int b) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum > max && sum <= b) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * Given an array need to find the sum of all the sub arrays sums.
     * Here: Trick we need to find how many times each element comes in each sub array multiply that number that amount of time
     *
     * @param arr given array
     * @return sum of all sub arrays sum
     */
    public long sumOfAllSubArray(int[] arr) {
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + ((long) arr[i] * (i + 1) * (n - i));
        }
        return sum;
    }

    /**
     * create 2d array from the given array
     *
     * @param arr given array
     * @return 2d array
     */
    public List<List<Integer>> created2DArray(int[] arr) {
        int n = arr.length;
        List<List<Integer>> twoDArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> cols = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    cols.add(arr[i]);
                }
                twoDArray.add(cols);
            }
        }
        return twoDArray;
    }
}
