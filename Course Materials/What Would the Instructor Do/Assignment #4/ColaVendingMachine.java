
public class ColaVendingMachine {
	// It keeps track of how many cola bottles are in the class 
	int bottles = 0;
	//and how much one bottle costs.
	float price = 1.5f;
	
	//There should be a method sellBottle 
	void sellBottle() {
		//which sells one bottle to a customer
		System.out.println("Enjoy your bottle...");
		// decreases the amount of bottles left. 
		this.bottles = this.bottles - 1;
		// next week we learn how to print an error
		// if we have 0 bottles	
	}
	
	//There also is a method restock 
	void restock(int numBottles) {
		// which sets the number of bottles to the number it 
		// is restocked to.
		this.bottles = numBottles;
		// or 
		// this.bottles = this.bottles + numBottles;
	}
	
	//Write a main method to test the functionality of the ColaVendingMachine machine.
	public static void main(String[] args) {
		ColaVendingMachine machine = new ColaVendingMachine();
		
		machine.restock(7);
		machine.sellBottle();
		
		//check bottles left
		System.out.println("Bottles left: " + machine.bottles);
	}

}
