package org.example;


public class BankAccount {
    private int balance;
    private String name;

    // Constructor for when we instantiate an instance of it in main class.
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = balance + amount;
        System.out.println("Deposited " + amount + " to " + name);
        System.out.println("New balance: " + this.balance);

    }
    public void withdraw(int amount) {
        this.balance = balance - amount;
        System.out.println(this.name + " Withdrew " + amount + " remaining balance is " + this.balance);
    }
    public void getBalance() {
        System.out.println(this.balance); // ToString() to include name??
    }

}
