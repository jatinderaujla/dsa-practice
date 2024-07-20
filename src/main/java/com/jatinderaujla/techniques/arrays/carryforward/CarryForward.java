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
                if (minI != -1) {
                    len = minI - maxI + 1;
                }
            } else if (arr[i] == min) {
                minI = i;
                if (maxI != -1) {
                    len = maxI - minI + 1;
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
                if (minI != -1) {
                    len = maxI - minI + 1;
                }
            } else if (arr[i] == min) {
                minI = i;
                if (maxI != -1) {
                    len = minI - maxI + 1;
                }
            }
            if (len < minLen) {
                minLen = len;
            }
        }
        return minLen;
    }

    /**
     * Find all the amazing substring of str
     * A amazing substring is one that starts with the vowel (a,e,i,o,u) (A,E,I,O,U)
     *
     * @param str given string
     * @return return count of subsequence possible which start with vowel character
     */
    public int countOfSubsequence(String str) {
        int n = str.length();
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                totalCount = totalCount + (n - i);
            }
        }
        return totalCount;
    }

    /**
     * Find the best time to buy or sell stock to get max profit
     *
     * @param arr given array with stock price on each day
     * @return max profit after at least 1 time buy and 1 time sell
     */
    public int maxProfit(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
    }

    /**
     * Find minimum number switch toggle required to turn on all bulb an in array
     * When we toggle the switch all the bulb on the right hand side of that bulb will toggle
     *
     * @param arr given array of 0 and 1. Zero represents bulb is off 1 represents bulb is on
     * @return minimum toggle count
     */
    public int minToggleCount(int[] arr) {
        int count = 0;
        int state = 0;
        for (int i = 0; i < arr.length; i++) {
            if (state == arr[i]) {
                count++;
                state = 1 - state;
            }
        }
        return count;
    }

    /**
     * Decide whether it is possible to divide the array into one or more sub arrays of even length
     * such that the first and last element of all sub arrays will be even.
     * Return "YES" if it is possible; otherwise, return "NO"
     * Such that
     *
     * @param arr given array
     * @return return YES if divide able else NO
     */
    public String divideArrayEvenly(int[] arr) {
        int n = arr.length;
        if (arr[0] % 2 == 0 && arr[n - 1] % 2 == 0 && n % 2 == 0) {
            return "YES";
        }
        return "NO";
    }

    /**
     * You are given an integer array A of size N. You have to perform B operations.
     * <p>In one operation, you can remove either the leftmost or the rightmost element of the array A.</p>
     * <p>Find and return the maximum possible sum of the B elements that were removed after the B operations.</p>
     * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
     * <ul>
     *     <li>Remove 3 elements from front and 0 elements from the back, OR</li>
     *     <li>Remove 2 elements from front and 1 element from the back, OR</li>
     *     <li>Remove 1 element from front and 2 elements from the back, OR</li>
     *     <li>Remove 0 elements from front and 3 elements from the back.</li>
     * </ul>
     * @param arr given array of integers
     * @param b no of operation
     * @return maximum possible sum or removed elements after b operation performed on array
     */
    public int pickFromBothSide(int[] arr, int b) {
        int n = arr.length;
        int[] pSum = new int[n];
        int[] sSum = new int[n];

        pSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        sSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sSum[i] = sSum[i + 1] + arr[i];
        }

        int max = Math.max(pSum[b - 1], sSum[n - b]);
        for (int i = 1; i < b; i++) {
            int sum = pSum[i - 1] + sSum[n - b + i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
