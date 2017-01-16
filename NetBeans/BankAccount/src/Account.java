/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author regradra
 */
public class Account {
<<<<<<< HEAD
    String accountName;
    String accountCurrency;
    String accountOwner;
    double accountAmount;
    double accountInterestRate;
    
    public Account (String accountOwner, double accountAmount) {
        this(null, "$", accountOwner, accountAmount, 5);
    }
            
    
    public Account (String accountName, String accountCurrency, String accountOwner,
            double accountAmount, double accountInterestRate) {
        this.accountAmount = accountAmount;
        this.accountInterestRate = accountInterestRate;
        this.accountName = accountName;
        this.accountCurrency = accountCurrency;
        this.accountOwner = accountOwner;
    }
    
    public void DisplayAccountOwner (String accountOwner) {
        System.out.println("Account Owner is: " + accountOwner);
    }
=======
    
>>>>>>> 1aed1cbd88a5930fbf72b075bad7006f8e94ea77
}
