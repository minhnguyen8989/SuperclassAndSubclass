public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount() {
        super();
        this.interestRate = 0.05; //5% interest rate for checking account
    }

    public void processWithdrawal() {
        System.out.println("Current Balance: " + getBalance());
        if (getBalance() < 0) {
            setBalance(getBalance() - 30);
            System.out.println("Overdraft fee of $30 applied *New balance: " + getBalance());
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate * 100 + "%");
    }
}
