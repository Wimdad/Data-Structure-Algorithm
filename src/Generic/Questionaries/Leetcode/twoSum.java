package Generic.Questionaries.Leetcode;

import java.util.Arrays;

public class twoSum {
    /*
    https://leetcode.com/problems/two-sum/
     */
    public static void main(String[] args) {
        int[] array = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSumOfAnIndicesFromBruteForceApproach(array, target)));
    }
    static int[] twoSumOfAnIndicesFromBruteForceApproach(int[] array, int target) {
        // Time complexity: O(n^2) times
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
