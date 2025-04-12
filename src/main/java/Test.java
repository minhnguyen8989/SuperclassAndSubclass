public class Test {
    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount();
        CheckingAccount customer2 = new CheckingAccount();

        try {
            customer1.setFirstName("John");
            customer1.setLastName("Smith");
            customer1.setAccountID(111111);
            customer1.deposit(200);
            customer1.deposit(50);
            customer1.withdrawal(150);
            customer1.accountSummary();
            System.out.println("-----------------------------");
            customer2.setLastName("Jannie");
            customer2.setFirstName("Holly");
            customer2.setAccountID(222222);
            customer2.deposit(100);
            customer2.withdrawal(80);
            customer2.accountSummary();
            customer2.processWithdrawal();
            customer2.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
