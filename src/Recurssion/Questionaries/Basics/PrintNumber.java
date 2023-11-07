package Recurssion.Questionaries.Basics;

public class PrintNumber {
    public static void main(String[] args) {
       printNumberFrom1toN(5);
    }

    static void printNumberFromNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberFromNto1(n - 1);
    }

    static void printNumberFrom1toN(int n) {
        if (n == 0) {
            return;
        }
        printNumberFrom1toN(n - 1);
        System.out.print(n + " ");
    }
    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printBoth(n - 1);
        System.out.print(n + " ");
    }
}
