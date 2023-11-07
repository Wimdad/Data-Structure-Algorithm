package Generic.Questionaries.Leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};
        reverseString(chars);
    }
    // brute force approach
    static void reverseString(char[] s) {
        String result = "";
        for (int i = s.length-1; i >=0 ; i--) {
            result += s[i];
        }
        char[] finalResult = result.toCharArray();
        System.out.println(Arrays.toString(finalResult));
    }
    // better approach
    static void betterApproach(char[] s) {

    }
}
