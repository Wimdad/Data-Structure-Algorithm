package Algorithm.BinariesSearchQuestionaries;

import java.util.Arrays;

public class SearchRange {
    /*
    Q. Given an array of integers numbers sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.

    Question was asked in facebook interview.
     */
    public static void main(String[] args) {
        int[] array = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(array, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] array, int target) {
        int[] result = {-1, -1};
        result[0] = search(array, target, true);
        if (result[0] != -1) result[1] = search(array, target, false);
        return result;
    }
    static int search(int[] array, int target, boolean searchFirstIndex) {
        int start = 0, end = array.length - 1;
        int answer = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                answer = mid;
                if (searchFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}
