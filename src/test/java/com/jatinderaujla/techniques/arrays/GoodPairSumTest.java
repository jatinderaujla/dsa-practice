package com.jatinderaujla.techniques.arrays;

import com.jatinderaujla.techniques.arrays.oned.GoodPairSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPairSumTest {

    GoodPairSum goodPairSum;

    @BeforeEach
    void setUp() {
        this.goodPairSum = new GoodPairSum();
    }

    @AfterEach
    void tearDown() {
        this.goodPairSum = null;
    }

    @Test
    void goodPairUsingHashMap() {
        int[] arr = new int[]{0, 3, 6, 4, 7};
        int target = 7;

        int[] pair = goodPairSum.goodPairUsingHashMap(arr, target);
        assertArrayEquals(new int[]{1, 3}, pair);

        arr = new int[]{-1, 2, 6, 4, 7, 10, -3};
        pair = goodPairSum.goodPairUsingHashMap(arr, target);
        assertArrayEquals(new int[]{5, 6}, pair);
    }

    @Test
    void goodPairSumOptimizedBruteForce() {
        int[] arr = new int[]{0, 3, 6, 4, 7};
        int target = 7;

        boolean pair = goodPairSum.goodPairSumOptimizedBruteForce(arr, target);
        assertTrue(pair);

        arr = new int[]{-1, 2, 6, 4, 7, 10, -3};
        pair = goodPairSum.goodPairSumOptimizedBruteForce(arr, target);
        assertTrue(pair);

        arr = new int[]{-1, 2, 6, 4, 7, 9, -3};
        pair = goodPairSum.goodPairSumOptimizedBruteForce(arr, target);
        assertFalse(pair);
    }
}