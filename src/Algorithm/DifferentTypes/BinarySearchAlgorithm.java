package Algorithm.DifferentTypes;

public class BinarySearchAlgorithm {
    /*
    Linear search is a simple and straightforward searching algorithm.
    1. It starts at the beginning of the list and checks each element one by one until the target element is found or the end of the list is reached.
    2. It is efficient for small lists, but its time complexity is O(n), where "n" is the number of elements in the list.
       In the worst case,it may have to search through all elements.
    3. Linear search does not require the list to be sorted, making it a universal search algorithm.

    Binary Search:
    1. Binary search is an efficient search algorithm, but it has specific requirements. It only works on sorted lists.
    2. It starts by comparing the target value with the middle element of the sorted list.
    3. If the middle element is equal to the target, the search is successful. If (target < array[middle]) the target is less than the middle element,
       the search continues in the lower half of the list; if (target > array[middle]) the target is greater, the search continues in the upper half.
    4. Binary search divides the search space in half with each comparison, so it has a time complexity of O(log n),
       making it very efficient for large sorted lists.
    5. It is a divide-and-conquer algorithm.
     */

    /*
   Key difference between linear and binary search:

   Efficiency: Binary search is more efficient than linear search for large sorted lists,
   as it has a time complexity of O(log n) compared to linear search's O(n).

   Sorted vs. Unsorted: Binary search requires the list to be sorted, while linear search works on both sorted and unsorted lists.

   Number of Comparisons: Binary search typically requires fewer comparisons to find the target element, thanks to its divide-and-conquer approach.

   Time Complexity: Binary search has a better average and worst-case time complexity, making it faster for large datasets.
                    Linear search has a linear time complexity.

   Space Complexity: Both algorithms have similar space complexity, usually O(1), as they do not require additional data structures.

    */
    public static void main(String[] args) {
        int[] array = {19,18,16,10};
        int target = 16;
        int result = orderAgnosticBinarySearch(array, target);
        System.out.println(result);
    }

    /*
    Array must be in sorted order either in ascending or descending in order to do the binary search.
    Algorithm for binary search:-
    Steps: 1. Find the middle element of the array
           2. if target is greater than middle element, then search in the right else search in the left.
           3. if middle element is equal to target. then we find the answer and return it.
     Question: Why binary search? Find the maximum number of such comparisons in worst case?
     Answer: Note:- When the fist middle element is what we are looking for is the target element, this is the best cas scenario O(1).
                    Total comparison in worst case is (longN).
                    Search in a 1 million : Linear search takes 1 million comparisons, but binary search takes only 20 comparisons.
     */

    static int linearSearch(int[] array, int target) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
    static int binarySearch(int[] array, int target) {
        // List of array elements are sorted in ascending order.
        int start = 0, end =  array.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
    /*
    Order Agnostic binary search
     */
    static int orderAgnosticBinarySearch(int[] array, int target) {
        // List of array elements are sorted in descending order.
        int start = 0, end = array.length - 1;
        // In order to check whether array is in ascending order or not...
        boolean isAscending = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) return mid;
            if (isAscending) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else if (target < array[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else if (target < array[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
