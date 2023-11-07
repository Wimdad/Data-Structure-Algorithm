package Generic.Questionaries.Leetcode;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    static int reverse(int x) {
        boolean isNegative = false;
        long reverse = 0;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
}
