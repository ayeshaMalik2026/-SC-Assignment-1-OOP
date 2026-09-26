public class Task1Test {
    public static void main(String[] args) {
        // Create wallet with $500 balance and PIN "1234"
        DigitalWallet wallet = new DigitalWallet("John Doe", 500.0, "1234");

        // Test 1: Invalid PIN
        wallet.withdraw(100.0, "9999"); // Expected: Invalid PIN

        // Test 2: Overdrawing funds
        wallet.withdraw(1000.0, "1234"); // Expected: Insufficient funds

        // Test 3: Successful withdrawal
        wallet.withdraw(150.0, "1234"); // Expected: Successful ($350 remaining)

        // Test 4: Check balance getter
        System.out.println("Current Balance: $" + wallet.getBalance());
    }
}