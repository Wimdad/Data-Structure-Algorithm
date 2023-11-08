public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Amount after adding or subtracting: " + percentageCalculator(10, 1249, true));
    }


    static double percentageCalculator(int percentage, int totalAmount, boolean checkTotalDiscount) {
        double totalPercentage = (double) (totalAmount * percentage) / 100;
        System.out.println("Percentage Amount: " + totalPercentage);
        double totalDiscountAfterSubtractingAmount =  totalAmount - totalPercentage;
        if (checkTotalDiscount) {
            return totalDiscountAfterSubtractingAmount;
        }
        return (totalAmount + totalPercentage);
    }
}
