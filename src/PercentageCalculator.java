public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Total Amount adding percentage: " + percentageCalculator(20, 650));
    }


    static double percentageCalculator(int percentage, int totalAmount) {
        double totalPercentage = (double) (totalAmount * percentage) / 100;
        System.out.println("Total Percentage on Amount: " + totalPercentage);
        return (totalAmount + totalPercentage);
    }
}
