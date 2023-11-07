package Recurssion.Questionaries.Basics;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
    static int sumOfDigits(int n) {
        // base condition
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
}
