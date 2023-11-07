package Sorting.SoringOne;


import java.util.Arrays;

public class InsertionSort {
    // Takes an element and place it in correct order. Notes: We r doing right sift...
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int n = arr.length;
        int[] array = insertionSort(arr, n);
        System.out.println(Arrays.toString(array));
    }
    static int[] insertionSort(int[] array, int n) {
        // Time complexity: Worst and best case O(n2) and best case
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
