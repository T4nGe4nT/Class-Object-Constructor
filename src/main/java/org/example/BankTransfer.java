package org.example;

public class BankTransfer {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount("Bob", 5000 );
        BankAccount alice = new BankAccount("Alice", 300 );

        bob.withdraw(100);
        alice.deposit(100);
    }
}
