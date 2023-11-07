package Algorithm.BinariesSearchQuestionaries;

public class SplitArray {
    /*
        Split array largest sum
        Given an integer array nums and an integer k, split nums into k non-empty subarrays
        such that the largest sum of any subarray is minimized.
        Return the minimized largest sum of the split.
        A subarray is a contiguous part of the array.

        Note:- ASKED IN GOOGLE
     */
    public static void main(String[] args) {
        int[] array = {7,2,5,10,8};
        int target = 0;
    }
    /*
    Algorithm: {7,2,5,10,8} -> first scenario -> {7,2,5,10} and {8} -> largest -> 24
               {7,2,5,10,8} -> second scenario -> {7,2,5} and {10,8} -> largest -> 18
               {7,2,5,10,8} -> third scenario -> {7,2} and {5,10,8} -> largest -> 23

              Minimum answer = maximum value in the array
              Maximum answer = sum of all the values in the array.
     */
    static int splitArray(int[] nums, int m) {
        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain maximum item from the array.
            end += nums[i];
        }
        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            // calculate in how many pieces we can divide this in with this maximum sum
            int sum = 0, pieces = 1;
            for (int num: nums) {
                if (sum + num > mid) {
                    // we cn't add this in this subarray, we need to make new one
                    // say we add this  num in  new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
                if (pieces > m) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }
}
