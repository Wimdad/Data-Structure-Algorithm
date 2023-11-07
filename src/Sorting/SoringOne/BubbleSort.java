package Sorting.SoringOne;

import java.util.Arrays;

public class BubbleSort {
    //Push maximum to the last by adjacent swap, right shift is done in the case of bubble sort
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4, 5, 6};
        int n = array.length;
        int[] bubbleSort = bubbleSort(array, n);
        System.out.println(Arrays.toString(bubbleSort));
    }
    static int[] bubbleSort(int[] array, int n) {
        // Time complexity:  Worst time complexity O(n2), best time complexity O(n)
        for (int i = n - 1; i >= 0 ; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    didSwap++;
                }
            }
            if (didSwap == 0) break;
            System.out.println("runs for "  + didSwap + " times");
        }

        return array;
    }
}
