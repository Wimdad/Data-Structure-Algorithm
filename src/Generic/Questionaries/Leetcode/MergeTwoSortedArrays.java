package Generic.Questionaries.Leetcode;

import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] mergedArray = mergedArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));

    }
    static int[] mergedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length &&  j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                k++;
                i++;
            } else {
                mergedArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            k++;
            i++;
        }

        while(j < arr2.length) {
            mergedArray[k] = arr2[j];
            k++;
            j++;
        }

        return mergedArray;
    }
}
