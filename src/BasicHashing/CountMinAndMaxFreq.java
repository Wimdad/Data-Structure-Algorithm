package BasicHashing;

public class CountMinAndMaxFreq {
    public static void main(String[] args) {
        int[] arr  = {10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);
    }
    // Time complexity of the code is O(n2) because it has two loops and each loops runs n times...
    static void countFreq(int[] arr, int n) {
        // to mark the visited as false initially....
        boolean[] visited = new boolean[n];
        int maxFreq = 0, minFreq = 0;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            // takes the value of count = 1 because every element in the array must appears once... so, there count must be 1.
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // updating the visited flag equal to true once i visited it...
                    visited[j] = true;
                    // increasing the count value, every time to 1 once i found the exact value in the loop
                    count++;
                }
            }
            // count max and min frequency element and count....
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            } else {
                minEle  = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle + " with count " + maxFreq);
        System.out.println("The lowest frequency element is: " + minEle + " with count " + minFreq);
    }
}
