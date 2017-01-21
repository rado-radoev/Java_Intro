import java.util.Scanner;

/**
 * Shoe class
 */
public class Shoe {
	/**
	 * Setting size and color attributes
	 */
	int size;
	String color;
	
	/**
	 * Shoe object constructor
	 * @param size		Sets shoe size
	 * @param color		Sets shoe color
	 */
	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}

	/**
	 * Prints shoe size
	 */
	void showSize() {
		System.out.println("Size: " + this.size);
	}
	
	/**
	 * Prints shoe color
	 */
	void showColor() {
		System.out.println("Color: " + this.color);
	}
	
	static public void main(String args[]) {
		Shoe shoe = new Shoe(7, "Black");
		
		/* Get user input*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter shoe size:");
		shoe.size = scanner.nextInt();

		System.out.print("Enter shoe color:");
		shoe.color = scanner.next();
		
		shoe.showSize();
		shoe.showColor();
		
		/* Close scanner stream */
		scanner.close();
	}
}