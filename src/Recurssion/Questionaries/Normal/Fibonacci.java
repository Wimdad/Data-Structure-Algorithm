package Recurssion.Questionaries.Normal;

public class Fibonacci {
    public static void main(String[] args) {
        int answer = fibonacci(50);
        /*
        Note:- In recursion, for this example of n = 50, functions call is repeated many times, it will takes a long time to complete the execution.
        Therefore, we use dynamic programming to solve this problem efficiently.
         */
        System.out.println(answer);
    }

    // Recursion expression --> In case of fibonacci series, the recursion expression -- > fibonacci(n-1) + fibonacci(n-2).
    // We have two types of recursion calls -- 1. Linear recursion calls (Fibonacci series) -- 2. Divide and conquer recursion calls (BS)
    static int fibonacci(int n) {
        /*
        Base condition is formed from the question itself. For example -- > fibonacci(0) = 1 and fibonacci(1) = 1.
        so, base condition for the fibonacci series is this
         */
        if (n < 2)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
