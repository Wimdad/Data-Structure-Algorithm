package Algorithm.BinariesSearchQuestionaries;

public class FindInElementInMountainArray {
    /*
    We need to find the fist occurrence of the target element in the array. If the target element is not
    there in the first half, we need to then find in the second half and return the index.

    Algorithm:
    1. First we need to the find the peak element in the array.
    2. Then do the binary search in the first half from 0 to peak, if we found the target element then return the index.
    2. If we didn't find the target element in the first half, then search in the second half from
       peak to array.length - 1, then return the index.
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2,1};
        int target = 3;
        System.out.println(search(array, target));
    }

    static int search(int[] array, int target) {
        int peakIndexInAnArray = peakIndexInMountainArray(array);
        int index = orderAgnosticBinarySearch(array, target, 0, peakIndexInAnArray);
        if (index != -1) {
            return index;
        }
        return orderAgnosticBinarySearch(array, target, peakIndexInAnArray, array.length - 1);
    }

    static int peakIndexInMountainArray(int[] array) {
        // Time complexity: O(logN) time.. binary search works only for sorted arrays...
        int start = 0, end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1]) {
                // we are in the descending part of an array, this may be an answer, but looks at left, this is why end ! = mid - 1
                end = mid;
            } else if (array[mid] < array[mid + 1]) {
                // we are int the ascending part of an array, because we know that mid + 1 element > mid element.
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the latest element because of the 2 checks above
        return start;
    }

    static int orderAgnosticBinarySearch(int[] array, int target, int start, int end) {
        // List of array elements are sorted in descending order.
        // In order to check whether array is in ascending order or not...
        boolean isAscending = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) return mid;
            if (isAscending) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else if (target < array[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else if (target < array[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
