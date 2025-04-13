/**
 * A class that represents a checking account, extending the BankAccount class.
 * It includes features like overdraft fee processing and displaying account details with interest rate.
 */
public class CheckingAccount extends BankAccount {

    private double interestRate;

    /**
     * Default constructor that initializes the checking account with a default interest rate of 5%.
     */
    public CheckingAccount() {
        super();
        this.interestRate = 0.05;
    }

    /**
     * Processes a withdrawal from the account, applying an overdraft fee of $30 if the balance is below 0.
     * Prints the current balance and the new balance after the fee is applied.
     */
    public void processWithdrawal() {
        System.out.println("Current Balance: " + getBalance());
        if (getBalance() < 0) {
            setBalance(getBalance() - 30);
            System.out.println("Overdraft fee of $30 applied *New balance: " + getBalance());
        }
    }

    /**
     * Displays the details of the account, including the account holder's information, balance, and interest rate.
     */
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate * 100 + "%");
    }
}
