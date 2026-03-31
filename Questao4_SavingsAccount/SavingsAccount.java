package Questao4_SavingsAccount;

public class SavingsAccount {

    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void simulate(SavingsAccount saver1, SavingsAccount saver2, double rate) {
        modifyInterestRate(rate);

        System.out.printf("%nTaxa anual: %.0f%%%n", rate * 100);
        System.out.printf("%-6s %12s %12s%n", "Mês", "Saver1", "Saver2");

        for (int month = 1; month <= 12; month++) {

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%-6d R$%10.2f R$%10.2f%n", month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        simulate(saver1, saver2, 0.04);
        simulate(saver1, saver2, 0.05);
    }
}
