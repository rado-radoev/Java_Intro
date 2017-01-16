/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author regradra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalAccount pa = new PersonalAccount(null, "Radoslav", null ,250, 5);
        System.out.println(pa.accountAmount);
        System.out.println(pa.accountCurrency);
        System.out.println(pa.accountOwner);
        System.out.println(pa.accountAmount);
    }
    
}
