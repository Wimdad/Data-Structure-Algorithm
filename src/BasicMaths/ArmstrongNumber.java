package BasicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
    static boolean armstrongNumber(int n) {
        int originalNumber = n;
        int count = 0;
        int temp = n;
        // Calculating count here
        while (temp != 0)
        {
            count++;
            temp = temp / 10;
        }
        int sumofpower = 0;
        // Calculating the sumofpower
        while (n != 0)
        {
            int digit = n % 10;
            sumofpower += (int) Math.pow(digit,count);
            n /= 10;
        }
        return (sumofpower == originalNumber);
    }
}
