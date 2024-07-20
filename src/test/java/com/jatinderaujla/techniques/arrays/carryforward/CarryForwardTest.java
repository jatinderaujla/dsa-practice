package com.jatinderaujla.techniques.arrays.carryforward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarryForwardTest {

    private final CarryForward carryForward = new CarryForward();

    @Test
    void countAGPairsReverseOrder() {
        int agPairs = carryForward.countAGPairs("abegag");
        assertEquals(3, agPairs);

        int agPairs1 = carryForward.countAGPairs("ggggaaa");
        assertEquals(0, agPairs1);

        int agPairs2 = carryForward.countAGPairs("aaggggggggg");
        assertEquals(18, agPairs2);
    }


    @Test
    void countAGPairs() {
        int agPairs = carryForward.countAGPairs("abegag");
        assertEquals(3, agPairs);

        int agPairs1 = carryForward.countAGPairs("ggggaaa");
        assertEquals(0, agPairs1);

        int agPairs2 = carryForward.countAGPairs("aaggggggggg");
        assertEquals(18, agPairs2);
    }

    @Test
    void leaderElementsBruteForce() {
        int[] arr = {3, 11, 5, 9, 6, 8};
        Integer[] expected = {11, 9, 8};
        Integer[] leaders = carryForward.leaderElementsBruteForce(arr);
        assertArrayEquals(expected, leaders);
    }

    @Test
    void leaderElements() {
        int[] arr = {3, 11, 5, 9, 6, 8};
        Integer[] expected = {11, 9, 8};
        Integer[] leaders = carryForward.leaderElements(arr);
        assertArrayEquals(expected, leaders);
    }

    @Test
    void minSubArrayLength() {
        int[] arr = {9, 1, 5, 9, 4, 2, 1};
        int minLen = carryForward.minSubArrayLengthReverseOrder(arr);
        assertEquals(2, minLen);
    }

    @Test
    void minSubArrayLengthReverseOrder() {
        int[] arr = {9, 1, 5, 9, 4, 2, 1};
        int minLen = carryForward.minSubArrayLength(arr);
        assertEquals(2, minLen);
    }

    @Test
    void maxProfit() {
        int[] arr = {1, 2};
        int maxProfit = carryForward.maxProfit(arr);
        assertEquals(1, maxProfit);

        arr = new int[]{};
        int maxProfit1 = carryForward.maxProfit(arr);
        assertEquals(0, maxProfit1);

        arr = new int[]{2, 1};
        int maxProfit2 = carryForward.maxProfit(arr);
        assertEquals(0, maxProfit2);

        arr = new int[]{2, 1, 1, 4};
        int maxProfit3 = carryForward.maxProfit(arr);
        assertEquals(3, maxProfit3);
    }

    @Test
    void countOfSubsequence() {
        String str = "ABEC";
        int count = carryForward.countOfSubsequence(str);
        assertEquals(6, count);

        str = "NBDH";
        count = carryForward.countOfSubsequence(str);
        assertEquals(0, count);

        str = "AAAA";
        count = carryForward.countOfSubsequence(str);
        assertEquals(10, count);

        str = "AJHU";
        count = carryForward.countOfSubsequence(str);
        assertEquals(5, count);

    }

    @Test
    void minToggleCount() {
        int[] arr = {1, 0, 1, 0};
        int count = carryForward.minToggleCount(arr);
        assertEquals(3, count);

        arr = new int[]{0, 0, 0, 0};
        count = carryForward.minToggleCount(arr);
        assertEquals(1, count);

        arr = new int[]{1, 1, 1, 1};
        count = carryForward.minToggleCount(arr);
        assertEquals(0, count);

        arr = new int[]{0, 1, 1, 1};
        count = carryForward.minToggleCount(arr);
        assertEquals(2, count);
    }

    @Test
    void divideArrayEvenly() {
        int[] arr = {2, 4, 8, 6};
        String result = carryForward.divideArrayEvenly(arr);
        assertEquals("YES", result);

        arr = new int[]{2, 4, 8, 6, 7};
        result = carryForward.divideArrayEvenly(arr);
        assertEquals("NO", result);

        arr = new int[]{2, 4, 8, 6, 7, 8};
        result = carryForward.divideArrayEvenly(arr);
        assertEquals("YES", result);

    }

    @Test
    void pickFromBothSide() {
        int[] arr = {5, -2, 3, 1, 2};
        int maxSum = carryForward.pickFromBothSide(arr, 3);
        assertEquals(8, maxSum);

        arr = new int[]{2, 3, -1, 4, 2, 1};
        maxSum = carryForward.pickFromBothSide(arr, 4);
        assertEquals(9, maxSum);
    }
}