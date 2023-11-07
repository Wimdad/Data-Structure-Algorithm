package Recurssion.Questionaries.Normal;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(binarySearch(array, target));
    }
    static int binarySearch(int[] array, int target) {
        // Time complexity for binary search: O(logN) times
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
