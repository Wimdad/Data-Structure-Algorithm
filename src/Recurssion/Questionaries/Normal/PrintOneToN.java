package Recurssion.Questionaries.Normal;

public class PrintOneToN {
    public static void main(String[] args) {
        print1ToN(5);
    }
    static void print1ToN(int n) {
        if (n == 0)
            return;
        // change this condition to print it in reverse order, just paste the system print line above the recursion call
        print1ToN(n - 1);
        System.out.print(n + " ");
    }
}
