package com.jatinderaujla;


import com.jatinderaujla.general.Fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private Fibonacci fibonacci;
    private final int num = 6;
    private final int expected = 8; //701408733 fib(44);

    @BeforeEach
    void setUp() {
        this.fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        this.fibonacci = null;
    }

    @Test
    void fibRecursionTest() {
        int actual = fibonacci.fibonacciWithRecursion(num);
        assertEquals(expected, actual);
    }

    @Test
    void fibRecursionDpTest() {
        int[] arr = new int[this.num + 1];
        Arrays.fill(arr, -1);
        int actual = fibonacci.fibonacciWithRecursionAndDynamicProgramming(num, arr);
        assertEquals(expected, actual);
    }

    @Test
    void fibDpTest() {
        int actual = fibonacci.fibonacciWithDynamicProgramming(num);
        assertEquals(expected, actual);
    }

    @Test
    void fibTest() {
        int actual = fibonacci.fibonacci(num);
        assertEquals(expected, actual);
    }

}