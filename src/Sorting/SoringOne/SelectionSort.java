package Sorting.SoringOne;

import java.util.Arrays;

public class SelectionSort {
    // Select minimum and swap.. that is our selection sort
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        int[] array = selectionSort(arr, n);
        System.out.println(Arrays.toString(array));
    }
    static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i <= n- 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= n - 1 ; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
