package String.Basics;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println((char) ('a' + 'b')); // convert the char into ascii number and add..
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 4));
        System.out.println("a" + 1);
        /*
        integer will be converted to wrapper (Integer) and that will call toString() method, this is same after
        few steps: "a" + "1"
         */
        System.out.println("Kunal" + new ArrayList<>()); // if it is object it will call toString() method
        System.out.println(new ArrayList<>() + " "  + 5); // if we are trying to concatenate two object it's not possible now

        System.out.println('a' + "b");
    }
}
