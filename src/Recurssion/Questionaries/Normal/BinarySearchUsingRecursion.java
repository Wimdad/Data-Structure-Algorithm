package Recurssion.Questionaries.Normal;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,66,78};
        int target = 4;
        System.out.println(binarySearchUsingRecursion(array, target, 0, array.length - 1));
    }
    static int binarySearchUsingRecursion(int[] array, int target, int start, int end) {
        // While doing recursion problem it's very important to understand the base condition and the recursive expression.
        // Note: Whatever variable we pass in the future function calls pass in the argument.
        if (start > end) return -1;
        int middle = start + (end - start) / 2;
        if (target == array[middle]) return middle;

        if (target < array[middle]) {
            return binarySearchUsingRecursion(array, target, start, middle - 1);
        }
        return binarySearchUsingRecursion(array, target, middle + 1, end);
    }
}
