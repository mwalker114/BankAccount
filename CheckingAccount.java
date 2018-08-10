/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwalker
 */
public class CheckingAccount extends BankAccount {
    private int minimumBalance = -1;
    private int overdraftFee = -1;

    public int getMinimumBalance() {
        return minimumBalance;
    }

    protected void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getOverdraftFee() {
        return overdraftFee;
    }

    protected void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
    
   
    
     @Override protected void PerformHealthCheck(){
        System.out.println("Account Number: " + accountNumber + "Bank Account Type: Bank Account");
        int minimumBalance = -1;

        if(minimumBalance >= -1 ) {
          System.out.print("Balance of $X falls under minimum requirements.  No withdrawals possible at this time.  Health check failed.");
      }
        else {
          System.out.print("Balance of $X amount is acceptable. Health Check passed.");
      }
     }
    
}
