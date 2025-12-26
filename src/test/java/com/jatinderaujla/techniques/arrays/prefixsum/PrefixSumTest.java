package com.jatinderaujla.techniques.arrays.prefixsum;

import com.jatinderaujla.techniques.arrays.prefixsum.PrefixSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefixSumTest {

    private final PrefixSum prefixSum = new PrefixSum();

    @Test
    void oddIndicesSum() {
        int[] arr = {16, 3, 3, 6, 7, 8, 17, 13, 7};
        int[][] queries = {
                {2, 6},
                {4, 7},
                {6, 7}
        };
        int[] ans = prefixSum.oddIndicesSum(arr, queries);
        assertArrayEquals(new int[]{14, 21, 13}, ans);
    }

    @Test
    void evenIndicesSum() {
        int[] arr = {16, 3, 3, 6, 7, 8, 17, 13, 7};
        int[][] queries = {
                {2, 6},
                {4, 7},
                {6, 7}
        };
        int[] ans = prefixSum.evenIndicesSum(arr, queries);
        assertArrayEquals(new int[]{27, 24, 17}, ans);
    }

    @Test
    void rangeSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] range = {
                {0, 3},
                {1, 2}
        };

        List<Long> rangeSums = prefixSum.rangeSum(arr, range);
        Long[] expectedRangeSums = {10L, 5L};
        Long[] actualRangeSums = rangeSums.toArray(new Long[0]);
        assertArrayEquals(expectedRangeSums, actualRangeSums);
    }

    @Test
    void minEquilibriumIndex() {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int expected = 3;
        int equilibriumIndex = prefixSum.minEquilibriumIndex(arr);
        assertEquals(expected, equilibriumIndex);

        arr = new int[]{1, 2, 3};
        int equilibriumIndex1 = prefixSum.minEquilibriumIndex(arr);
        assertEquals(-1, equilibriumIndex1);
    }

    @Test
    void rangeSumBruteForce() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] range = {
                {0, 3},
                {1, 2}
        };
        int[] sum = prefixSum.rangeSumBruteForce(arr, range);
        assertArrayEquals(new int[]{10, 5}, sum);
    }
}