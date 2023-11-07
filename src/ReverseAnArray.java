import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,7,9,11,12,45};
        int target = 3;
        System.out.println(search(array, target));
    }
    static int[] reverseAnArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int search(int []nums, int target) {
        // Write your code here.
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
