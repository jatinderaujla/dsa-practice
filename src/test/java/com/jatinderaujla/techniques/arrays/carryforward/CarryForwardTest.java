package com.jatinderaujla.techniques.arrays.carryforward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        int[] arr = {9 ,1, 5, 9, 4, 2, 1};
        int minLen = carryForward.minSubArrayLengthReverseOrder(arr);
        assertEquals(2, minLen);
    }

    @Test
    void minSubArrayLengthReverseOrder() {
        int[] arr = {9 ,1, 5, 9, 4, 2, 1};
        int minLen = carryForward.minSubArrayLength(arr);
        assertEquals(2, minLen);
    }
}