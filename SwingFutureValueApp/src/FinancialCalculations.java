public class FinancialCalculations {
    public static final int MONTH_IN_YEAR = 12;
    public static double calculateFutureValue(double monthlyPayment, double yearlyInterestRate, int years) {
        int month = years * MONTH_IN_YEAR;
        double monthlyInterestRate = yearlyInterestRate / MONTH_IN_YEAR / 100;
        double futureValue = 0;
        for (int i = 1; i <= month; i ++)
            futureValue = (futureValue + monthlyPayment) * (1 + monthlyInterestRate);
        return futureValue;
    }

}