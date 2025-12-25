package com.jatinderaujla.techniques.arrays.oned;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {

    ReverseArray reverseArray;

    @BeforeEach
    void setUp() {
        this.reverseArray = new ReverseArray();
    }

    @AfterEach
    void tearDown() {
        this.reverseArray = null;
    }

    @Test
    void reverseArray() {
        int[] arr = new int[]{-1, -1, -1, -1};
        int[] reversedArray = reverseArray.reverseArray(arr);
        assertArrayEquals(new int[]{-1, -1, -1, -1}, reversedArray);

        arr = new int[]{1, 2, 3, 4};
        reversedArray = reverseArray.reverseArray(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, reversedArray);
    }

    @Test
    void reverseArrayInRange() {
        int[] arr = new int[]{-1, -1, -1, -1};
        int[] reversedArray = reverseArray.reverseArrayInRange(arr, 1, 3);
        assertArrayEquals(new int[]{-1, -1, -1, -1}, reversedArray);

        arr = new int[]{1, 2, 3, 4};
        reversedArray = reverseArray.reverseArrayInRange(arr, 1,3);
        assertArrayEquals(new int[]{1, 4 ,3 ,2}, reversedArray);
    }
}