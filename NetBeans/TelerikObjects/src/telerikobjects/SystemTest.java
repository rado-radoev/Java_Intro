/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telerikobjects;

/**
 *
 * @author regradra
 */
public class SystemTest {
    public static void main(String[] args) {
        int sum = 0;
        long startTime = System.currentTimeMillis();
       
        // The code fragment to be tested
        for(int i = 0; i < 1000000000; i++) {
            sum++;
        }
       
        long endTime = System.currentTimeMillis();
        System.out.printf("The time elapsed is %f sec%n",
            (endTime - startTime)/1000.0);
    }
}
