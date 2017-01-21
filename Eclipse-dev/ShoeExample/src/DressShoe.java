import java.util.Scanner;

public class DressShoe extends Shoe {

	/**
	 * Dress shoe class
	 * @param size		Dress shoe size
	 * @param color		Dress shoe color
	 */
	public DressShoe(int size, String color) {
		super(size, color);
	}
	
	static public void main(String args[]) {
		DressShoe dressShoe = new DressShoe(7, null);
		
		/* Get user input*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter dress shoe size:");
		dressShoe.size = scanner.nextInt();
		
		System.out.print("Enter dress shoe color:");
		dressShoe.color = scanner.next();
		
		dressShoe.showSize();
		dressShoe.showColor();
		
		/* Close scanner stream */
		scanner.close();
	}


}
