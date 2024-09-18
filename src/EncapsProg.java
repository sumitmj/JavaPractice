class BankAccount {
    private final String AccountHolder;
    private double balance;

    public BankAccount (String AccountHolder, double InitialBalance) {
        this.AccountHolder = AccountHolder;
        if (InitialBalance >= 0) {
            this.balance = InitialBalance;
        } else {
            System.out.println("The initial balance cannot be negative.");
            this.balance = 0;
        }
    }
    // Get method for AccountHolder name and balance
    public String getAccountHolder() {
        return AccountHolder;
    }
    public double getBalance() {
        return balance;
    }
    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("The deposit amount must be in positive");
        }
    }
    // Withdraw Money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class EncapsProg {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sumit", 500);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());

        account.deposit(200);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(400);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}
