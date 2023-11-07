package Algorithm.BinariesSearchQuestionaries;

public class RotationCountInRotatedSortedArray {
    /*
        Find the rotation count in the sorted rotated array.
        Algorithm: 1. Find pivot index and add 1 to the pivot index, that's our result.
     */
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(countRotations(array));
    }
    static int countRotations(int[] array) {
        int pivot = findPivot(array);
        return pivot + 1;
    }
    static int findPivot(int[] array) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            if (array[mid] <= array[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
