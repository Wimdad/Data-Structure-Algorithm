package Generic.Questionaries.Leetcode;

public class RemoveDuplicates {
    /*
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3};
        int k = removeDuplicates(array);
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
    /*
    Love the algorithm for this solution..
     */
    static int removeDuplicates(int[] array) {
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j]; // replace the value of array[i] with array[j] for the next iteration...
            }
        }
        return i + 1;
    }
}
