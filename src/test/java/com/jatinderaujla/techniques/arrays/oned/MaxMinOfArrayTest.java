package com.jatinderaujla.techniques.arrays.oned;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinOfArrayTest {

    MaxMinOfArray maxMinOfArray;

    @BeforeEach
    void setUp() {
        maxMinOfArray = new MaxMinOfArray();
    }

    @AfterEach
    void tearDown() {
        maxMinOfArray = null;
    }

    @Test
    void findMaxElementOfArrayUsingSort() {
        int[] arr = new int[]{8,8,8,8};
        int maxElementOfArrayUsingSort = maxMinOfArray.findMaxElementOfArrayUsingSort(arr);
        assertEquals(8, maxElementOfArrayUsingSort);

        arr = new int[]{7,8,6};
        int maxElementOfArrayUsingSort1 = maxMinOfArray.findMaxElementOfArrayUsingSort(arr);
        assertEquals(8, maxElementOfArrayUsingSort1);

        arr = new int[]{6,8,7};
        int maxElementOfArrayUsingSort2 = maxMinOfArray.findMaxElementOfArrayUsingSort(arr);
        assertEquals(8, maxElementOfArrayUsingSort2);

        arr = new int[]{0, -1, 6, 8, 7, 9};
        int maxElementOfArrayUsingSort3 = maxMinOfArray.findMaxElementOfArrayUsingSort(arr);
        assertEquals(9, maxElementOfArrayUsingSort3);

    }

    @Test
    void findMaxElementOfArray() {
        int[] arr = new int[]{8,8,8,8};
        int maxElementOfArrayUsingSort = maxMinOfArray.findMaxElementOfArray(arr);
        assertEquals(8, maxElementOfArrayUsingSort);

        arr = new int[]{7,8,6};
        int maxElementOfArrayUsingSort1 = maxMinOfArray.findMaxElementOfArray(arr);
        assertEquals(8, maxElementOfArrayUsingSort1);

        arr = new int[]{6,8,7};
        int maxElementOfArrayUsingSort2 = maxMinOfArray.findMaxElementOfArray(arr);
        assertEquals(8, maxElementOfArrayUsingSort2);

        arr = new int[]{0, -1, 6, 8, 7, 9};
        int maxElementOfArrayUsingSort3 = maxMinOfArray.findMaxElementOfArray(arr);
        assertEquals(9, maxElementOfArrayUsingSort3);
    }

    @Test
    void findMinElementOfArray() {
        int[] arr = new int[]{8,8,8,8};
        int maxElementOfArrayUsingSort = maxMinOfArray.findMinElementOfArray(arr);
        assertEquals(8, maxElementOfArrayUsingSort);

        arr = new int[]{7,8,6};
        int maxElementOfArrayUsingSort1 = maxMinOfArray.findMinElementOfArray(arr);
        assertEquals(6, maxElementOfArrayUsingSort1);

        arr = new int[]{6,8,7};
        int maxElementOfArrayUsingSort2 = maxMinOfArray.findMinElementOfArray(arr);
        assertEquals(6, maxElementOfArrayUsingSort2);

        arr = new int[]{0, -1, 6, 8, 7, 9};
        int maxElementOfArrayUsingSort3 = maxMinOfArray.findMinElementOfArray(arr);
        assertEquals(-1, maxElementOfArrayUsingSort3);
    }

    @Test
    void findSecondMaxElementOfArray() {
        int[] arr = new int[]{8,8,8,8};
        int maxElementOfArrayUsingSort = maxMinOfArray.findSecondMaxElementOfArray(arr);
        assertEquals(Integer.MIN_VALUE, maxElementOfArrayUsingSort);

        arr = new int[]{7,8,6};
        int maxElementOfArrayUsingSort1 = maxMinOfArray.findSecondMaxElementOfArray(arr);
        assertEquals(7, maxElementOfArrayUsingSort1);

        arr = new int[]{6,8,7};
        int maxElementOfArrayUsingSort2 = maxMinOfArray.findSecondMaxElementOfArray(arr);
        assertEquals(7, maxElementOfArrayUsingSort2);

        arr = new int[]{0, -1, 6, 8, 7, 9};
        int maxElementOfArrayUsingSort3 = maxMinOfArray.findSecondMaxElementOfArray(arr);
        assertEquals(8, maxElementOfArrayUsingSort3);
    }

    @Test
    void findSecondMinElementOfArray() {
    }
}