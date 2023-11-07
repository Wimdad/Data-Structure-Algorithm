package Generic.Questionaries.Leetcode;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        int[] array = {5,8,9,18,16,7,2,21};
        System.out.println(secondLargeElementInTheArrayUsingForLoop(array));
    }
    static int largestElementInTheArray(int[] array) {
        // brute force approach, Time complexity: O(n^2) time
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > largestElement) {
                    largestElement = array[j];
                }
            }
        }
        return largestElement;
    }

    static int largestElementWithBetterApproach(int[] array) {
        // time complexity: O(n) time, better approach
        int largestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }
        return largestElement;
    }
    static  int largestElementWithoutForLoop(int[] array)  {
        int largestElement = array[0];
        int i = 0;
        // while loop means when to stop the loop, otherwise it will keep looping.
        while (i < array.length) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
            i++;
        }
        return largestElement;
    }

    static int secondLargeElementInTheArrayUsingWhileLoop(int[] array) {
        // this is an important question, here the time complexity: O(n) times
        int largestElement = Integer.MIN_VALUE;
        int secondLargeElement = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] > largestElement) {
                secondLargeElement = largestElement;
                largestElement = array[i];
            } else if (array[i] > secondLargeElement && array[i] != largestElement) {
                secondLargeElement  = array[i];
            }
            i++;
        }
        return secondLargeElement;
    }

    static int secondLargeElementInTheArrayUsingForLoop(int[] array) {
        int largestElement = array[0];
        int secondLargeElement = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestElement) {
                secondLargeElement = largestElement;
                largestElement = array[i];
            } else if (array[i] > secondLargeElement && array[i] != largestElement) {
                secondLargeElement = array[i];
            }
        }
        return secondLargeElement;
    }
}
