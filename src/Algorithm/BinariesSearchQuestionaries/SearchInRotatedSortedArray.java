package Algorithm.BinariesSearchQuestionaries;

public class SearchInRotatedSortedArray {
    /*
    Asked in the Amazon and Google interview question.
    https://leetcode.com/problems/search-in-rotated-sorted-array/
    Q. Search in rotated sorted array.
    Algorithm:- 1. Find pivot element in sorted array.
                2. After getting pivot element search in the first half of the array from 0 to pivot.
                3. If it is not find in the first half of the array, then start searching in the second half from pivot + 1 to array.length - 1.
    When (mid > mid + 1), then we find the pivot element.
     */
    public static void main(String[] args) {
        // In this array we don't have any duplicates, so it perfectly fine
        int[] array = {5,1,3};
        int target = 5;
        System.out.println(search(array, target));
    }
    /*
    this will not work for the arrays with duplicates.
     */
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int index = binarySearch(nums, target, 0, pivot);
        // if index is negative that means we should unable to find the element in the first half of the nums...
        if (index != -1) {
            return index;
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    /*
    It's very much important to find the pivot, because using this pivot element we r going to find
    the element index from the array.
     */
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
