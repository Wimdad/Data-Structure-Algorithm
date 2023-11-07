package Recurssion.Questionaries.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 18, 9, 9};
        int target = 9;
        System.out.println(returnListOfInteger(array, target, 0));
    }

    static int linearSearchUsingAnRecursion(int[] array, int target, int index) {
        if (index == array.length) return -1;
        if (target == array[index]) return index;
        return linearSearchUsingAnRecursion(array, target, index + 1);
    }
    static int linearSearch(int[] array, int target, int index) {
        while (index < array.length) {
            if (target == array[index]) return index;
            index++;
        }
        return -1;
    }
    static int findFirstIndex(int[] array, int target, int index) {
        if (index == array.length) return -1;
        if (target == array[index]) return index;
        return findFirstIndex(array, target, index+1);
    }
    static int findIndexLast(int[] array, int target, int index) {
        if (index == -1) return -1;
        if (target == array[index]) return index;
        return findIndexLast(array, target, index-1);
    }

    static java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
    static void findAllIndex(int[] array, int target, int index) {
        if (index == array.length) return;

        if (target == array[index]) list.add(index);

        findAllIndex(array, target, index+1);
    }

    static java.util.ArrayList<Integer> findAllIndexAndStoreItInList(int[] array, int target, int index, java.util.ArrayList<Integer> list) {
        if (index == array.length) return list;
        if (target == array[index]) {
            list.add(index);
        }
         return findAllIndexAndStoreItInList(array, target, index + 1, list);
    }

    static java.util.ArrayList<Integer> returnListOfInteger(int[] array, int target, int index) {
        // They are calling different objects for different functions calls, therefore it keeps on updating
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        if (index == array.length) return list;
        // this will contain answer for that function call only
        if (target == array[index]) list.add(index);

        java.util.ArrayList<Integer> ansFromBelowCalls =  returnListOfInteger(array, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
