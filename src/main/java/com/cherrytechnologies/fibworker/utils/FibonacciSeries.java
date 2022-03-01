package com.cherrytechnologies.fibworker.utils;

public class FibonacciSeries {

    public static int getValue(int number) {
        return fibonacci(number);
    }

    private static int fibonacci(int number) {
        if (number <= 1) return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
