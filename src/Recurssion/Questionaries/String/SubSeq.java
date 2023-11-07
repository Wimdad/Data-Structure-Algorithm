package Recurssion.Questionaries.String;

public class SubSeq {
    public static void main(String[] args) {
        String string = "abc";
        printSubSeq("", string);
    }
    static void printSubSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char character   = up.charAt(0);
        printSubSeq(p+character, up.substring(1));
        printSubSeq(p, up.substring(1));
    }
}
