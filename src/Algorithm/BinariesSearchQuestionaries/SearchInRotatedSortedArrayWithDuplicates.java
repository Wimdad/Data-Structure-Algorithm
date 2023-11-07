package Algorithm.BinariesSearchQuestionaries;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] array = {2,9,2,2,2};
        int target = 2;
        System.out.println(search(array, target));
    }

    static int search(int[] array, int target) {
        int pivot = findPivot(array);
        int index = binarySearch(array, target, 0, pivot);
        if (index != -1) {
            return index;
        }
        return binarySearch(array, target, pivot + 1, array.length - 1);
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
            // if elements at middle, start, and end are equal then just skip the duplicates.
            if (array[mid] == array[start] && array[mid] != array[end]) {
                // skip the duplicates
                // NOTE: what if an element at this start and end are pivot?
                // check if start is pivot
                if (array[start] > array[start + 1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (array[end] < array[end + 1]) {
                    return end -1;
                }
                end--;
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
