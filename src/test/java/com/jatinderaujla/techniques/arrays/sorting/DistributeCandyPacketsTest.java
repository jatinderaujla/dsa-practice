package com.jatinderaujla.techniques.arrays.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandyPacketsTest {

    private final DistributeCandyPackets distributeCandyPackets = new DistributeCandyPackets();

    @Test
    void minDistribution() {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int x = 3;
        int minDistribution = distributeCandyPackets.minDistribution(arr, x);
        assertEquals(2, minDistribution);
    }
}