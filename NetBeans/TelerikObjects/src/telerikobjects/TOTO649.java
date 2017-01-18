/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telerikobjects;
import java.util.Random;
/**
 *
 * @author regradra
 */
public class TOTO649 {
    public static void main(String[] args) {
    Random rand = new Random();    
        for (int i = 0; i < 6; i++) {
            int randomNumber = rand.nextInt(49) + 1;
            System.out.printf("%d ", randomNumber);
        }
    }
    
}
