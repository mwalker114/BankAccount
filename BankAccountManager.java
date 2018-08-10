/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mwalker
 */
public class BankAccountManager extends BankAccount {
    
    

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         
         BankAccount[] allAccounts = new BankAccount[8];
        BankAccount Quesz = new SavingsAccount();
        allAccounts[0] = Quesz;
        BankAccount Sam = new SavingsAccount();
        allAccounts[1] = Sam;
        BankAccount Nick = new SavingsAccount();
        allAccounts[2] = Nick;
        BankAccount Brent = new SavingsAccount();
        allAccounts[3] = Brent;
        BankAccount Sade = new CheckingAccount();
        allAccounts[4] = Sade;
        BankAccount Damon = new CheckingAccount();
        allAccounts[5] = Damon;
        BankAccount Chris = new CheckingAccount();
        allAccounts[6] = Chris;
        BankAccount Katy = new CheckingAccount();
        allAccounts[7] = Katy;        
    }
     
    
}
