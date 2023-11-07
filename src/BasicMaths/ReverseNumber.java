package BasicMaths;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1534236469));
    }
    static int reverseNumberUsingRecursion(int n, int reverse) {
       if (n == 0)
           return reverse;
       return reverseNumberUsingRecursion(n/10, reverse * 10 + n % 10);
    }

    static int reverseNumber(int x) {
        long reverse = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE) return 0;
        return (int) (isNegative ? -reverse : reverse);
    }
}
