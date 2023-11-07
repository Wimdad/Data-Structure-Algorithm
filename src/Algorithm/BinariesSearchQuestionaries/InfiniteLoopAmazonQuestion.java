package Algorithm.BinariesSearchQuestionaries;

public class InfiniteLoopAmazonQuestion {
    /*
    Asked in the Amazon Interview Question.
     */
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingAnswer(array, target));
    }

    static int findingAnswer(int[] array, int target) {
        // find the start and end points, in order to solve this question that all we need.
        // first start with the box of size 2.
        int start = 0, end = 1;
        // condition for the target to lie in the range
        while (target > array[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(array, target, start, end);
    }

    /*
    In this question we don't know about the start and end... so we increase the size exponentially...
     */
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
