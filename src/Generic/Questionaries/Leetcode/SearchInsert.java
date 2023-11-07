package Generic.Questionaries.Leetcode;

public class SearchInsert {
    /*
    https://leetcode.com/problems/search-insert-position/
     */
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(array, target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
