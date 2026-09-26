public class DigitalWallet {

    // Private fields enforce strict encapsulation
    private String accountHolder;
    private double balance;
    private final String pinCode; // Marked final so it can only be set ONCE during creation

    // Constructor sets PIN once and validates initial balance
    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.pinCode = pinCode;
        
        // Business Rule: Balance can never be negative
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("Warning: Initial balance cannot be negative. Defaulted to 0.0.");
        }
    }

    // Getter and Setter for Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for Balance (Read-only access, no direct setter)
    public double getBalance() {
        return balance;
    }

    // Deposit method enforcing positive values
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit failed: Amount must be positive.");
        }
    }

    // Business Rule: Processes withdrawal ONLY if PIN matches and funds exist
    public boolean withdraw(double amount, String enteredPin) {
        if (!this.pinCode.equals(enteredPin)) {
            System.out.println("Withdrawal Failed: Invalid PIN.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal Failed: Invalid amount.");
            return false;
        }
        if (amount > this.balance) {
            System.out.println("Withdrawal Failed: Insufficient funds.");
            return false;
        }

        this.balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: $" + this.balance);
        return true;
    }
}