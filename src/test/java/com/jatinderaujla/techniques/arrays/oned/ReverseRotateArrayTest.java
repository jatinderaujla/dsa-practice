package com.jatinderaujla.techniques.arrays.oned;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseRotateArrayTest {

    ReverseRotateArray reverseRotateArray;

    @BeforeEach
    void setUp() {
        this.reverseRotateArray = new ReverseRotateArray();
    }

    @AfterEach
    void tearDown() {
        this.reverseRotateArray = null;
    }

    @Test
    void reverseArray() {
        int[] arr = new int[]{-1, -1, -1, -1};
        int[] reversedArray = reverseRotateArray.reverseArray(arr);
        assertArrayEquals(new int[]{-1, -1, -1, -1}, reversedArray);

        arr = new int[]{1, 2, 3, 4};
        reversedArray = reverseRotateArray.reverseArray(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, reversedArray);
    }

    @Test
    void reverseArrayInRange() {
        int[] arr = new int[]{-1, -1, -1, -1};
        int[] reversedArray = reverseRotateArray.reverseArrayInRange(arr, 1, 3);
        assertArrayEquals(new int[]{-1, -1, -1, -1}, reversedArray);

        arr = new int[]{1, 2, 3, 4};
        reversedArray = reverseRotateArray.reverseArrayInRange(arr, 1, 3);
        assertArrayEquals(new int[]{1, 4, 3, 2}, reversedArray);
    }

    @Test
    void rotateArrayKTimes() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] rotatedArrayKTimes = reverseRotateArray.rotateArrayKTimes(arr, 3);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, rotatedArrayKTimes);

        arr = new int[]{1, 2, 3, 4, 5};
        rotatedArrayKTimes = reverseRotateArray.rotateArrayKTimes(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, rotatedArrayKTimes);

        rotatedArrayKTimes = reverseRotateArray.rotateArrayKTimes(arr, 6);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, rotatedArrayKTimes);

        rotatedArrayKTimes = reverseRotateArray.rotateArrayKTimes(arr, 99);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, rotatedArrayKTimes);


    }
}