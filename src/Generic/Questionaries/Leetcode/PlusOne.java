package Generic.Questionaries.Leetcode;

import java.util.Arrays;

public class PlusOne {
    /*
    best question i like the approach..
     */
    public static void main(String[] args) {
        int[] digits = new int[]{9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOneBruteForce(int[] digits) {
        int[] result = new int[digits.length];
        int smallestElement = Integer.MAX_VALUE;
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length-1] < smallestElement) {
                smallestElement = digits[i];
            } else {
                largestElement = digits[i];
            }
            result[i] = digits[i];
        }
        int elementToReplace;
        if (digits[digits.length-1] == largestElement) {
            elementToReplace = largestElement + 1;
        } else {
            elementToReplace =  smallestElement + 1;
        }
        result[digits.length-1] = elementToReplace;
        if (digits.length == 1) {
            int[] newResult = new int[2];
            if (elementToReplace >= 10) {
                newResult[0] = elementToReplace / 10;
                newResult[1] = elementToReplace % 10;
            } else if (elementToReplace < 5){
                return result;
            } else {
                newResult[1] = elementToReplace % 10;
            }
            return newResult;
        }
        return result;
    }

    static int[] plusOne(int[] digits) {
        // reverse loop from right to left..
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
