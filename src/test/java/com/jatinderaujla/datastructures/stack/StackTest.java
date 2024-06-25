package com.jatinderaujla.datastructures.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new StackWithArray<>();
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isEmpty());
    }

    @Test
    void pop() {
        assertThrows(RuntimeException.class, () -> stack.pop());
        stack.push(1);
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(4);
        assertEquals(4, stack.pop());
        assertFalse(stack.isEmpty());
    }

    @Test
    void peek() {
        assertThrows(RuntimeException.class, () -> stack.peek());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void newStackWithGivenSize(){
        
    }
}