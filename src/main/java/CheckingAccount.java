public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        double newAmount = getBalance() - amount;
        System.out.println("New Balance: " + newAmount);

        if (newAmount < 0) {
            newAmount -= 30.0;
            System.out.println("Overdraft fee of $30 applied.");
        }
        System.out.println(newAmount);

    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
