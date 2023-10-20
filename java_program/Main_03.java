
// this program is copy paste on chat gpt bequese undarstand me

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterest() {
        return 0.0; // Default interest calculation
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05; // 5% interest
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}

public class Main_03 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(1500);

        savings.deposit(200);
        checking.withdraw(100);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());

        double savingsInterest = savings.calculateInterest();
        double checkingInterest = checking.calculateInterest();

        System.out.println("Savings Account Interest: " + savingsInterest);
        System.out.println("Checking Account Interest: " + checkingInterest);
    }
}