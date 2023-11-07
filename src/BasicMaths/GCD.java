package BasicMaths;

public class GCD {
    public static void main(String[] args) {
        int a = 4, b = 8;
        int ans = gcd(a, b);
        System.out.print("The GCD of the two numbers is "+ans);
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
