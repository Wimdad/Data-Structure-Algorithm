package Generic.Questionaries.Leetcode;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(count(8));
    }
    static int count(int n) {
        return numberOfSteps(n, 0);
    }

    static int numberOfSteps(int n, int count) {
        if (n == 0) return count;
        if (n % 2 == 0) return numberOfSteps(n / 2, count + 1);
        return numberOfSteps(n - 1, count + 1);
    }
}
