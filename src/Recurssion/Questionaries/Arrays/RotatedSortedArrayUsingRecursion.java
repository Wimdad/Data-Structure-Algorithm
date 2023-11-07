package Recurssion.Questionaries.Arrays;

public class RotatedSortedArrayUsingRecursion {
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,1,2,3};
        int target = 1;
        System.out.println(search(array, target, 0, array.length - 1));
    }

    static int search(int[] array, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;

        if (array[mid] == target) return mid;

        if (array[start] <= array[mid]) {
            if (target >= array[start] && target <= array[mid]) {
                return search(array, target, 0, mid - 1);
            } else {
                return search(array, target, mid + 1, end);
            }
        }

        if (array[mid] <= array[end]) {
            return search(array, target, mid + 1, end);
        } else {
            return search(array, target, 0, mid - 1);
        }
    }
}
