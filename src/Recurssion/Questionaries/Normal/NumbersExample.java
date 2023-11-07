package Recurssion.Questionaries.Normal;

public class NumbersExample {
    public static void main(String[] args) {
        printNumbers(1);
    }
    static void printNumbers(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // this is called tail recursion because this is the last function call.
        printNumbers(n + 1);
    }
}
