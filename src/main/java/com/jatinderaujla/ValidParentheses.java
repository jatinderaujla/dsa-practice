package com.jatinderaujla;

import java.util.Stack;

public class ValidParentheses {

    /**
     * Check valid parentheses using stack data structure
     *
     * @param parentheses string
     * @return true if given string contains proper opening and closing parentheses else false
     */
    public boolean isValidParenthesesUsingStack(String parentheses) {

        int len = parentheses.length();
        int index;
        boolean isValid = false;
        Stack<Character> stack = new Stack<>();
        for (index = 0; index < len; index++) {
            char c = parentheses.charAt(index);
            if (stack.isEmpty()) {
                if (c == ']' || c == '}' || c == ')') {
                    isValid = false;
                    break;
                } else {
                    stack.push(c);
                    isValid = false;
                }
            } else {
                char b = stack.peek();
                if ((c == ']' && b == '[') || (c == '}' && b == '{') || (c == ')' && b == '(')) {
                    stack.pop();
                    isValid = true;
                } else {
                    stack.push(c);
                    isValid = false;
                }
            }
        }
        if(!stack.isEmpty()) isValid = false;
        return isValid;
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '[') stack.push(']');
            else if(c == '{') stack.push('}');
            else if(c == '(') stack.push(')');
            else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
