package com.jatinderaujla.techniques.arrays.sorting;

public class DistributeCandyPackets {
    /**
     * Distribute packets among x students such that
     * 1. each students get exactly one packet
     * 2. The diff between the maximum number of toffee given to student is minimum
     *
     * @param arr given array of candy packets
     * @param x   given number of students
     * @return minimum difference between maximum and minimum distribution
     */
    public int minDistribution(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] < arr[j]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - x; i++) {
            int diff = arr[i] - arr[i + x - 1];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}
