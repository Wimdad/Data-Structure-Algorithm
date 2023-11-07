package BasicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
    static boolean checkPalindrome(int n) {
        int reverse = 0;
        int x = n;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (reverse == x) {
            return true;
        } else {
            return false;
        }
    }
}
