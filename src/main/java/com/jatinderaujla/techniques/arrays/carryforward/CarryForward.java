package com.jatinderaujla.techniques.arrays.carryforward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarryForward {

    /**
     * Given a lowercase string count the no of a,g pairs exists in the given string
     * such that arr[i] < arr[j]
     * Here traversing from right to left
     *
     * @param str given string
     * @return no of A,G pair count
     */
    public int countAGPairsReverseOrder(String str) {
        int pairs = 0;
        int gCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'g') {
                gCount++;
            } else if (str.charAt(i) == 'a') {
                pairs = pairs + gCount;
            }
        }
        return pairs;
    }

    /**
     * Given a lowercase string count the no of a,g pairs exists in the given string
     * such that arr[i] < arr[j]
     * Here traversing from left to right
     *
     * @param str given string
     * @return no of A,G pair count
     */
    public int countAGPairs(String str) {
        int pairs = 0;
        int aCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                aCount++;
            } else if (str.charAt(i) == 'g') {
                pairs = pairs + aCount;
            }
        }
        return pairs;
    }

    public Integer[] leaderElementsBruteForce(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return leaders.toArray(new Integer[0]);
    }

    /**
     * Given an array arr
     * and found all the leader elements from the given array
     * Leader elements is an elements whose all the right side elements are smaller than it.
     * e.g. arr = [3, 11, 5 ,9, 6, 8]
     * leaders = [11, 9, 8]
     */
    public Integer[] leaderElements(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxEl = arr[arr.length - 1];
        leaders.add(maxEl);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
                leaders.add(maxEl);
            }
        }
        Collections.reverse(leaders);
        return leaders.toArray(new Integer[0]);
    }

    /**
     * Find the sub array with minimum length which start with or end with min and max elements in it
     *
     * @param arr given array
     * @return length of smallest sub array
     */
    public int minSubArrayLengthReverseOrder(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        int minI = -1;
        int maxI = -1;
        int len = arr.length;
        int minLen = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == max) {
                maxI = i;
                if(minI != -1){
                    len = minI - maxI + 1;
                }
            } else if (arr[i] == min) {
                minI = i;
                if(maxI != -1){
                    len = maxI - minI +  1;
                }
            }
            if (len < minLen) {
                minLen = len;
            }
        }
        return minLen;
    }

    public int minSubArrayLength(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        int minI = -1;
        int maxI = -1;
        int len = arr.length;
        int minLen = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxI = i;
                if(minI != -1){
                    len = maxI - minI + 1;
                }
            } else if (arr[i] == min) {
                minI = i;
                if(maxI != -1){
                    len = minI - maxI +  1;
                }
            }
            if (len < minLen) {
                minLen = len;
            }
        }
        return minLen;
    }
}
