package String.Basics;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Waquar Imdad is fun";
        System.out.println(Arrays.toString(name.toCharArray()));
        // it's creating a new object as we know string is immutable...
        String newName = name.toLowerCase();
        boolean isCheck = name == newName;
        System.out.println(isCheck);
        System.out.println(name.substring(0, 6));
        System.out.println("    Waquar Imdad   ".strip());
        // Q. Difference between strip and trim
        System.out.println("    Waquar Imdad   ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
