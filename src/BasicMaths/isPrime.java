package BasicMaths;

public class isPrime {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = (isPrime(n));
        if (ans) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }
    }
    static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
