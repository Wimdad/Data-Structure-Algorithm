package Recurssion.Questionaries.Arrays;

import java.util.Arrays;

public class FindIndexOfAnTargetElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,6,7,8,9};
        int target = 4;
        System.out.println(Arrays.toString(findIndexOfAnTargetElement(array, target)));
    }
    static int[] findIndexOfAnTargetElement(int[] array, int target) {
        int[] result = new int[2];
        result[0] = binarySearch(array, target);
        result[1] = binarySearch(array, target);
        return result;
    }
    static int binarySearch(int[] array, int target) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                start = mid + 1;
            } else if (target > array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
