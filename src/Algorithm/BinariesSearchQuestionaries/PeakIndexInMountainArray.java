package Algorithm.BinariesSearchQuestionaries;

public class PeakIndexInMountainArray {
    /*
    Mountain array is also called bitonic array...
     */
    public static void main(String[] args) {
        int[] array = {0,1,0};
        System.out.println(peakIndexInMountainArray(array));
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
}
