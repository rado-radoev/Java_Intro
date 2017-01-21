/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */

import java.util.Scanner;
public class Chapter_2 extends Chapter_2SuperClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
//		int number = scanner.nextInt();
		
//		System.out.println("Is the number even?:");
//		System.out.println(Chapter_2SuperClass.isEven(number));
//		
//		System.out.println("Can the number be divided by 5 and 7?:");
//		System.out.println(Chapter_2SuperClass.isDivisableByFiveAndSeven(number));
//		
//		System.out.println("Does the number contain 7?:");
//		System.out.println(Chapter_2SuperClass.isThirdDigitSeven(number));
//		
//		System.out.println("Is bit zero");
//		System.out.println(Chapter_2SuperClass.isBitZero(number, 2));
//		
//		System.out.println("Enter person's weight on earth to calculate moon weight:");
//		System.out.println(Chapter_2SuperClass.calculateMoonWeight(number));
		
		
//		Chapter_2SuperClass.numberTricks(number);
		
		Chapter_2SuperClass.CheckBit(155, 5, 1);

		scanner.close();
	}

}
