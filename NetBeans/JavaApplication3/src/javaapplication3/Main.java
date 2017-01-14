/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author regradra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(~Integer.MAX_VALUE));
        
        
        System.out.println(0 ^ 0);
        System.out.println(0 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(1 ^ 1);
                
    }
    
   
    
}
