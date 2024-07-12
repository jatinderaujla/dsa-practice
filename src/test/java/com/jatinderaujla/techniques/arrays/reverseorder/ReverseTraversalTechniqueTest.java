package com.jatinderaujla.techniques.arrays.reverseorder;

import com.jatinderaujla.techniques.arrays.reverserorder.ReverseTraversalTechnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseTraversalTechniqueTest {

    private final ReverseTraversalTechnique reverseTraversalTechnique = new ReverseTraversalTechnique();
    private final int[] arr = {3, 11, 5, 9, 6, 8};
    private final Integer[] expected = {11, 9, 8};

    @Test
    void testLeaderBruteForce() {
        Integer[] leaders = reverseTraversalTechnique.leaderElementsBruteForce(arr);
        assertArrayEquals(expected, leaders);
    }

    @Test
    void testLeaderElements() {
        Integer[] leaders = reverseTraversalTechnique.leaderElements(arr);
        assertArrayEquals(expected, leaders);
    }

}