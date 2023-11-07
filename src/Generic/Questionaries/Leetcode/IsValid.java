package Generic.Questionaries.Leetcode;

import java.util.Objects;

public class IsValid {
    public static void main(String[] args) {
        String string = "{[]}";
        System.out.println(isValid(string));
    }
    static boolean isValid(String string) {
        String[] validParenthesis = {"(", ")", "{", "}", "[", "]"};
        int j = 0;
        String[] givenString = string.split("");
        for (int i = 0; i < givenString.length - 1; i++) {
            if ((givenString[i] + givenString[i + 1]).equals(validParenthesis[j])) {
                j++;
                return true;
            }
        }
        return false;
    }
}
