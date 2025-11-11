//Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
//methods to deposit and withdraw money



package lect6;

class BankAccount {
    int accountNumber;
    String accountholder ;
    double balance;


    BankAccount(String accountholder, int accountNumber, double balance) {
        this.accountholder = accountholder;
        this.accountNumber = accountNumber;
        this.balance= balance;
    }

    void displayDetails() {
        System.out.println("accountholder: " + accountholder);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("balance: " + balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
  class Eight{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("pushpa", 101, 5000.0);
        account1.displayDetails();
        account1.deposit(1500.0);
        account1.displayDetails();  
        account1.withdraw(2000.0);
        account1.displayDetails();
    }

}
