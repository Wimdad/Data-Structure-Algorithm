package Sorting.SoringOne;

import java.util.Arrays;

public class AllSortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        int[] array = bubbleSort(arr, n);
        System.out.println(Arrays.toString(array));
    }
    static int[] selectionSort(int[] array, int n) {
        for (int i = 0; i <= n - 2 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= n - 1 ; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    static int[] bubbleSort(int[] array, int n) {
        for (int i = n - 1; i >= 0 ; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    didSwap++;
                }
            }
            if (didSwap == 0) break;
        }
        return array;
    }

    static int[] insertionSort(int[] array, int n) {
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j > 0 && array[j-1] > array[j]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
