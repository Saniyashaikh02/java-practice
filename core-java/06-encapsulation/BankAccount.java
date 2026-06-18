public class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println(
                "Current Balance: " +
                account.getBalance());
    }
}