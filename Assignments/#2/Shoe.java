import java.util.Scanner;

public class Shoe {
	int size = 0;
	
	public Shoe(int size) {
		super();
		this.size = size;
	}

	void showSize() {
		System.out.println("Size: " + this.size);
	}
	
	static public void main(String args[]) {
		Shoe shoe = new Shoe(7);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter shoe size:");
		shoe.size = scanner.nextInt();
		shoe.showSize();
	}
}