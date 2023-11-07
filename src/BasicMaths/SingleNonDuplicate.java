package BasicMaths;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] array = {2,2,3,2};
        System.out.println(binarySearch(array));
    }
    /*
    If the nums is in sorted order then first try to apply binary search..
     */
    static int binarySearch(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else if ((nums[mid] == nums[mid + 1] && mid %2 == 0) ||
                    (nums[mid] == nums[mid-1] && mid %2 != 0)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
