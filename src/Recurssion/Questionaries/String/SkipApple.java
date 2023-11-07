package Recurssion.Questionaries.String;

public class SkipApple {
    public static void main(String[] args) {
        String string = "bacappcdah";
        System.out.println(skipAppNotApple(string));
    }
    static String skip(String string) {
        if (string.isEmpty()) return "";
        char character = string.charAt(0);
        boolean checkStartsWith = string.startsWith("apple");
        if (checkStartsWith)
            return skip(string.substring(5));
        return character + skip(string.substring(1));
    }
    static String skipAppNotApple(String string) {
        if (string.isEmpty()) return "";
        if (string.startsWith("app") && !string.startsWith("apple")) {
            return skipAppNotApple(string.substring(3));
        } else {
            return string.charAt(0) + skipAppNotApple(string.substring(1));
        }
    }
}
