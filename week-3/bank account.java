public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0.0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    // Deposit method to add money to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdrawal method to subtract money from the account
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a new bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000.00);

        // Deposit money into the account
        account.deposit(500.00);

        // Withdraw money from the account
        account.withdrawal(2000.00);

        // Check and display the current balance
        System.out.println("Current Balance: " + account.getBalance());
        System.out.println("priya");
    }
}
