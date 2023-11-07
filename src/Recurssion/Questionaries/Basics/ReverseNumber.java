package Recurssion.Questionaries.Basics;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345, 0));
    }
    static int reverseNumber(int n, int reverse) {
        // base condition... this is an important base condition that we have for reverse numbers
        if (n == 0) return reverse;
        return reverseNumber(n/10, (reverse * 10 + (n % 10)));
    }
}
