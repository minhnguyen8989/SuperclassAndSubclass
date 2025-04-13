public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    /**
     * Deposits a specified amount into the bank account.
     *
     * @param amount The amount to deposit. It must be greater than 0.
     * @throws IllegalArgumentException if the deposit amount is less than or equal to 0.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + " to the account " + accountID);
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than $0.");
        }
    }

    /**
     * Withdraws a specified amount from the bank account.
     *
     * @param amount The amount to withdraw. It must be greater than 0.
     * @throws IllegalArgumentException if the withdrawal amount is less than or equal to 0,
     *                                  or if there are insufficient funds in the account.
     */
    public void withdrawal(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            System.out.println("You are withdrawing: $" + amount + " from the account " + accountID);
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be greater than $0.");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Prints a summary of the account, including account holder information, account ID, and current balance.
     */
    public void accountSummary() {
        System.out.println("Account holder first name: " + firstName);
        System.out.println("Account holder last name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Your current balance is: $" + balance);
    }
}
