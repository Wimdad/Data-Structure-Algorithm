package String.Basics;

public class SB {
    public static void main(String[] args) {
        // String is immutable in java, that means once we declare an string we can't change it again..
        // Concepts: 1. String Pool 2. Immutability
        String str = "abc";
        System.out.println(str.charAt(0));

        System.out.println(printNicely(new int[] {1,2,3,4,5,6,7,8,9,10,11}));

        float f = 123.14f;
        System.out.printf("Formatted values is %.2f", f);
    }

    public static String printNicely(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        java.lang.StringBuilder b = new java.lang.StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
