package com.jatinderaujla.general;

public class Fibonacci {

    /**
     * calculate fibonacci number of given number using Recursion
     *
     * @param num number who fibonacci need to be calculated
     * @return fibonacci number
     */
    public int fibonacciWithRecursion(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacciWithRecursion(num - 1) + fibonacciWithRecursion(num - 2);
    }

    /**
     * calculate fibonacci of given number using Dynamic Programming
     *
     * @param num given number
     * @param arr arr of pre calculate fibonacci
     * @return fibonacci number
     */
    public int fibonacciWithRecursionAndDynamicProgramming(int num, int[] arr) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        if (arr[num] != -1) {
            return arr[num];
        }
        return arr[num] = fibonacciWithRecursionAndDynamicProgramming(num - 1, arr) + fibonacciWithRecursionAndDynamicProgramming(num - 2, arr);
    }

    /**
     * calculate fibonacci of given number using Bottom UP approach(means Without Recursion)
     * with Dynamic Programming
     *
     * @param num given number
     * @return fibonacci number
     */
    public int fibonacciWithDynamicProgramming(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num];
    }

    /**
     * calculate fibonacci using 2 variables
     *
     * @param num given number
     * @return fibonacci number
     */
    public int fibonacci(int num) {
        int first = 0;
        int second = 1;
        int temp = -1;
        if (num == 0) return 0;
        if (num == 1) return 1;
        for (int i = 2; i <= num; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return temp;
    }
}
