package Recurssion.Questionaries.Normal;

public class BasicRecursion {
    public static void main(String[] args) {
        printString("John Doe", 10);
    }
    static void printString(String str,  int n) {
        // Base condition to stop recursion
        if (n == 0) return;
        System.out.println(str);
        printString(str, n - 1);
    }
}
