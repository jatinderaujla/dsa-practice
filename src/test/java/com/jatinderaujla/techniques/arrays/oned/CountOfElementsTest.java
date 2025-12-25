package com.jatinderaujla.techniques.arrays.oned;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOfElementsTest {

    CountOfElements countOfElements;
    @BeforeEach
    void setUp() {
        this.countOfElements = new CountOfElements();
    }

    @AfterEach
    void tearDown() {
        this.countOfElements = null;
    }

    @Test
    void countOfElements() {
        int[] arr = new int[]{3,1,2};
        int count = countOfElements.countOfElements(arr);
        assertEquals(2, count);

        arr = new int[]{8,8,8,8};
        int countZero = countOfElements.countOfElements(arr);
        assertEquals(0, countZero);

        arr = new int[]{5,5,2,5};
        int countOne = countOfElements.countOfElements(arr);
        assertEquals(1, countOne);
    }

    @Test
    void countOfElementsSingleLoop() {
        int[] arr = new int[]{3,1,2};
        int count = countOfElements.countOfElementsSingleLoop(arr);
        assertEquals(2, count);

        arr = new int[]{8,8,8,8};
        int countZero = countOfElements.countOfElementsSingleLoop(arr);
        assertEquals(0, countZero);

        arr = new int[]{5,5,2,5};
        int countOne = countOfElements.countOfElementsSingleLoop(arr);
        assertEquals(1, countOne);
    }

    @Test
    void countOfElementsBruteForce() {
        int[] arr = new int[]{3,1,2};
        int count = countOfElements.countOfElementsBruteForce(arr);
        assertEquals(2, count);

        arr = new int[]{8,8,8,8};
        int countZero = countOfElements.countOfElementsBruteForce(arr);
        assertEquals(0, countZero);

        arr = new int[]{5,5,2,5};
        int countOne = countOfElements.countOfElementsBruteForce(arr);
        assertEquals(1, countOne);
    }

    //1,2,7,5,4
}