import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial balance for the bank account:");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        System.out.println("Initial balance: " + account.getBalance());
        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: " + account.getBalance());
        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        System.out.println("Enter amount to withdraw (overdraw test):");
        double overdrawAmount = scanner.nextDouble();
        account.withdraw(overdrawAmount);
        System.out.println("Balance after overdraw attempt: " + account.getBalance());

        scanner.close();
    }
}