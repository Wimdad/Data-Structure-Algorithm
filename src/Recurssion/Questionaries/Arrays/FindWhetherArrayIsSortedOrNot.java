package Recurssion.Questionaries.Arrays;

public class FindWhetherArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,6,5};
        System.out.println(arrayIsSorted(array, 0));
    }
    static boolean arrayIsSorted(int[] array, int index) {
        if (index == array.length - 1) return true;
        return array[index] < array[index + 1] && arrayIsSorted(array, index + 1);
    }
}
