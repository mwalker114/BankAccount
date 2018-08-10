/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwalker
 */
public class BankAccount {
    int accountNumber = -1;
    int balance = -1;

    public int getAccountNumber() {
        return accountNumber;
    }

    protected void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }
     protected void PerformHealthCheck(){
        System.out.println("Account Number: " + accountNumber + "Bank Account Type: Bank Account");
        System.out.println("Health Check invalid for this type of Account.");
    
    }
    
}
