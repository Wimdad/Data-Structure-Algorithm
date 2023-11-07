package Recurssion.Questionaries.Normal;

public class CountNumberOfZeroes {
    public static void main(String[] args) {
        System.out.println(count(100002));
    }
    static int countNumberOfZeroes(int n, int count) {
        // Time complexity: O(n) time
        while (n != 0) {
            int digit = n % 10;
            if (digit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n,  int count) {
        if (n == 0) return count;
        int digit = n % 10;
        if (digit == 0) return helper(n/10, count + 1);
        return helper(n/10, count);
    }
}
