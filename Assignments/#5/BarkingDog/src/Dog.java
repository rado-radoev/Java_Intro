import java.util.Scanner;

public class Dog {
	
	// Dog object attribute
	private int size;
	
	/**
	 * Dog object constructor
	 * @param size	Dog's size
	 */
	public Dog (int size) {
		super();
		setSize(size);
	}
	
	// Dog size getter
	public int getSize() {
		return this.size;
	}
	
	// Dog size setter
	public void setSize(int size) {
		this.size = size;
	}
	
	// Implement Bark interface
	public static void barking(Bark bark) {
		bark.perform();
	}
	
	public static void main(String[] args) {
		
		// size = user input
		Scanner scanner = new Scanner(System.in);
		int size = -1;
		while (size < 0) {
			System.out.print("Enter dog's size: ");
			size = scanner.nextInt();
			if (size < 0) {
				System.out.println("Your dog's size cannot be negative number. Try again.");
			}
		}
		
		// Close scanner object
		scanner.close();
		
		// Create dog object
		Dog whiteFang = new Dog(size);
		
		System.out.println("Your dog can make this sound... ");
		
		// Return dog's barking sounds depending on its size
		if (whiteFang.getSize() > 0 && whiteFang.getSize() <= 5) {
			barking(() -> System.out.println("Yip! Yip!"));
		} 
		else if (whiteFang.getSize() > 5 && whiteFang.getSize() <= 10) {
			barking(() -> System.out.println("Ruff! Ruff!"));
		}
		else {
			barking(() -> System.out.println("Woof! Woof!"));
		}
	}
	


}
