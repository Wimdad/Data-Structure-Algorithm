package Recurssion.Questionaries.String;

public class SkipCharacter {
    public static void main(String[] args) {
        String string = "abcabcbb";
        System.out.println(skip(string));
    }
    /*
    Processed = p, Unprocessed = up.
    I love the approach
    Algorithm: 1. take the first character by using chartAt(0) method.
               2. check if the character is equal to the given target, here we r checking for 'a'
               3. if the character is equal to the given target, then skip it by recursively calling the recursion method taking result as same
                  but increase the pointer of the string to 1 by using substring method.
               4. else if the character is not equal to the given target then call the skip method by taking result + character and incrementing the pointer
                  to 1 by using substring method.othe
     */
    static String skip(String result, String string) {
        if (string.isEmpty()) return result;
        char character = string.charAt(0);
        if (character == 'a') {
            return skip(result, string.substring(1));
        }
        return skip(character+result, string.substring(1));
    }

    static String skip(String string) {
        if (string.isEmpty()) return "";
        char character = string.charAt(0);
        if (character == 'a') {
            return skip(string.substring(1));
        } else {
            return character + skip(string.substring(1));
        }
    }
}
