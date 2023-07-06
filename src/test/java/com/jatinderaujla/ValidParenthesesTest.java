package com.jatinderaujla;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @AfterEach
    void tearDown() {
        validParentheses = null;
    }

    @Test
    void isValidTest() {
        assertTrue(validParentheses.isValidParenthesesUsingStack("()"));
        assertTrue(validParentheses.isValidParenthesesUsingStack("()[]{}"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("(([{[}]]))"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("(]"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("))}]"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("(({}{[[]}))"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("([]){"));
        assertFalse(validParentheses.isValidParenthesesUsingStack("([]"));
    }

    @Test
    void isValidTest2() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(([{[}]]))"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("))}]"));
        assertFalse(validParentheses.isValid("(({}{[[]}))"));
        assertFalse(validParentheses.isValid("([]){"));
        assertFalse(validParentheses.isValid("([]"));
    }
}