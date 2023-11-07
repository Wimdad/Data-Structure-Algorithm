package String.Basics;

public class Performance {
    public static void main(String[] args) {
        /*
        Time Complexity: O(N2) times. Because we are keep on creating new objects every time for each loop... as we know string is immutable..
        So, in order to resolve this we have another data structure that we called StringBuilder.
         */
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}
