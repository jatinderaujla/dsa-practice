package com.jatinderaujla.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueStringTest {

    private String unique = "abcdefgh";
    private String nonUnique = "abdacdsefa";

    private UniqueString uniqueString;

    @BeforeEach
    void setUp() {
        uniqueString = new UniqueString();
    }

    @Test
    void isUniqueBruteForce() {
        assertTrue(uniqueString.isUniqueBruteForce(unique));
        assertFalse(uniqueString.isUniqueBruteForce(nonUnique));
    }

    @Test
    void isUniqueUsingSet() {
        assertTrue(uniqueString.isUniqueUsingSet(unique));
        assertFalse(uniqueString.isUniqueUsingSet(nonUnique));
    }

    @Test
    void isUniqueUsingSort() {
        assertTrue(uniqueString.isUniqueUsingSort(unique));
        assertFalse(uniqueString.isUniqueUsingSort(nonUnique));
    }

    @Test
    void isUniqueUsingBitManipulation() {
        assertTrue(uniqueString.isUniqueUsingBitManipulation(unique));
        assertFalse(uniqueString.isUniqueUsingBitManipulation(nonUnique));
    }
}