/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author regradra
 */
public class PersonalAccount extends Account {
    
    public PersonalAccount (String accountName, String accountCurrency, String accountOwner,
            int accountAmount, int accountInterestRate) {
        super(accountName, accountCurrency, accountOwner, accountAmount, accountInterestRate);
    }
}
