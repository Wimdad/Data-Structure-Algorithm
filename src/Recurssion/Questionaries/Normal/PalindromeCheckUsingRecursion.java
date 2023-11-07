package Recurssion.Questionaries.Normal;

public class PalindromeCheckUsingRecursion {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(0, "madam"));
    }
    static boolean checkPalindrome(int i, String str) {
        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if (i >= str.length()/2) return true;
        // If start is not equal to end, not palindrome.
        if (str.charAt(i) != str.charAt(str.length() -i - 1)) return false;
        // If both characters are same, increment i and check start+1 and end-1.
        return checkPalindrome(i + 1, str);
    }
}
