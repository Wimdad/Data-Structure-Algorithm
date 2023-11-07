package Recurssion.Questionaries.Normal;

public class SumOf1stNNumber {
    public static void main(String[] args) {
        int result = sumOf1stNNumber(10);
        System.out.println(result);
    }
    static int sumOf1stNNumber(int n) {
        // Base condition is important for the recursive call to happen
        if (n == 0)
            return 0;
       return n + sumOf1stNNumber(n - 1);
    }
}
