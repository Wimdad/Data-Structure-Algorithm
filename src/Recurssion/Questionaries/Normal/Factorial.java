package Recurssion.Questionaries.Normal;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        // The factorial of 0 is 1... base condition is very much important
        if (n < 2)
            return n;
        return n * factorial(n - 1);
    }
}
