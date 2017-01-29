import java.util.Scanner;

public class FormatNumber {

	public static void main(String[] args)
	{
		System.out.print("Enter a 5-digitnumber: ");
		
		// read number
		Scanner input = new Scanner (System.in);
		int fullNumber = input.nextInt();
		
		// 1st digit 
		System.out.print((fullNumber/10000) + " ");
		
		// 2nd digit
		System.out.print(((fullNumber % 10000) / 1000) + " ");
		
		// 3rd digit
		System.out.print(((fullNumber % 1000) / 100) + " ");
		
		// reader can continue
	}
}