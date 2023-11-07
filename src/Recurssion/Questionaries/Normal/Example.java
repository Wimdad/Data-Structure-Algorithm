package Recurssion.Questionaries.Normal;

public class Example {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }
    static int fibonacci(int n) {
        if (n == 1 || n == 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
