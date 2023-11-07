package Algorithm.BinariesSearchQuestionaries;

public class CellingAndFloorOfNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int target = 6;
        int result = ceilingNumber(array, target);
        System.out.println(result);
    }
    /*
    Note:- Whenever we see sorted list without thinking anything just apply binary search and it works 90 percent of the time.
    Q. Find the ceiling of the given number.
    A. Ceiling is the smaller number in an array which is greater than or equal to the target number.
       (element >= target)
     */
    static int ceilingNumber(int[] array, int target) {
        int start = 0, end = array.length - 1;
        int mid = 0;
        // but what if target is greater than the greatest number in the array
        if (target > array[array.length - 1]) return -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
    /*
    Q. Find the floor of the given number.
    A. Floor is the greater number in the array which is smaller than or equal to the the target number.
        (element <= target)
     */
    static int floorNumber(int[] array, int target) {
        int start = 0, end = array.length - 1;
        int mid = 0;
        // but what if target is less than the smallest number in the array
        if (target < array[array.length - 1]) return -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
