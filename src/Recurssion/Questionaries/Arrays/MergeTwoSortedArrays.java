package Recurssion.Questionaries.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};
        int m = 3, n = 3;
        System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, m, n)));
    }
    public static int[] ninjaAndSortedArrays(int arr1[], int nums2[], int m, int n) {
        // Write your code here.
        int i = 0, j = 0, k = 0;
        int[] mergedArrays = new int[m+n];
        while (i < m && j < n) {
            if (arr1[i] < nums2[j]) {
                mergedArrays[k] = arr1[i];
                i++;
            } else {
                mergedArrays[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mergedArrays[k] = arr1[i];
            i++;
            j++;
        }

        while(j < n) {
            mergedArrays[k] = nums2[j];
            j++;
            k++;
        }
        return mergedArrays;
    }
}
