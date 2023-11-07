package Sorting.SoringTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }
    static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) /2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }
    static void merge(int[] array, int low, int mid, int high){
        ArrayList<Integer> tempArray = new ArrayList<>();
        int left = low;
        int right = mid + 1;

    }
}
