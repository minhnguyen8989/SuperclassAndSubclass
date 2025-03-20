public class Main {
    public static void main(String[] args) {

        BankAccount cus1 = new BankAccount();

        CheckingAccount cus2 = new CheckingAccount(3.5);


        System.out.println("CUS1----------------------------------");

        cus1.setLastName("John");
        cus1.setFirstName("Jane");
        cus1.setAccountID(12399999);
        cus1.getBalance();


        System.out.println(cus1.getLastName());
        System.out.println(cus1.getAccountID());


        System.out.println("CUS2----------------------------------");

        System.out.println(cus2.getBalance());

        cus2.deposit(200.0);
        System.out.println(cus2.getBalance());

        cus2.withdrawal(150);
        System.out.println(cus2.getBalance());

        cus2.processWithdrawal(100.0);
        System.out.println(cus2.getBalance());
    }
}
