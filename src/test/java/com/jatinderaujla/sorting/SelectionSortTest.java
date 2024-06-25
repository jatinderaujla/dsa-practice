package com.jatinderaujla.sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    void setUp(){
        this.selectionSort = new SelectionSort();
    }

    @AfterEach
    void tearDown(){
        this.selectionSort = null;
    }

    @Test
    void selectionSort() {
        int[] unsortedArray = {5, 8, 1, 3, 4};
        int[] sortedArray = {1, 3, 4, 5, 8};
        selectionSort.selectionSort(unsortedArray);

        Assertions.assertArrayEquals(unsortedArray, sortedArray);
    }
}