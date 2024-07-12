package com.jatinderaujla.prefixsum;

import com.jatinderaujla.techniques.prefixsum.PrefixSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PrefixSumTest {

    private final PrefixSum prefixSum = new PrefixSum();
    private final int[] arr = {16, 3, 3, 6, 7, 8, 17, 13, 7};
    private final int[][] queries = {
            {2, 6},
            {4, 7},
            {6, 7}
    };

    @Test
    void oddIndicesSumTest() {
        int[] ans = prefixSum.oddIndicesSum(arr, queries);
        assertArrayEquals(new int[]{14, 21, 13}, ans);
    }

    @Test
    void evenIndicesSumTest() {
        int[] ans = prefixSum.evenIndicesSum(arr, queries);
        assertArrayEquals(new int[]{27, 24, 17}, ans);
    }

    @Test
    void testRangeSum() {
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
}