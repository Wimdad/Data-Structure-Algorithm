package Recurssion.Questionaries.Arrays;

public class LinearSearchUsingArray {
    public static void main(String[] args) {
        int[] array = {3,2,1,18,9};
        int target = 18;
        System.out.println(linearSearchUsingArray(array, target, 0));
    }
    static int linearSearchUsingArray(int[] array, int target, int index) {
        // Time complexity: O(n) time
        while (index < array.length) {
            if (array[index] == target) {
                return index;
            }
            index++;
        }
        return -1;
    }
    static boolean linearSearchUsingRecursion(int[] array, int target, int index) {
        // base condition, if we r not able to find the target element in the entire array then we r returning as a false...
        if (index == target) return false;
        return array[index] == target || linearSearchUsingRecursion(array, target, index+ 1);
    }

    static int linearSearchAlgorithmRecursion(int[] array, int target, int index) {
        if (index == target) return -1;
        if (array[index] == target) {
            return index;
        } else {
            return linearSearchAlgorithmRecursion(array, target, index+1);
        }
    }
}
