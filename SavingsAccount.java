/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwalker
 */
public class SavingsAccount extends BankAccount {
    private int interestRate = -1;

    SavingsAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    SavingsAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getInterestRate() {
        return interestRate;
    }

    protected void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
   @Override protected void PerformHealthCheck(){
        System.out.println("Account Number: " + accountNumber + "Bank Account Type: Bank Account");
        System.out.println("Account Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    
    }
}
