
public class ColaVendingMachine {

	/**
	 * Create a class machine
	 * Create a class bottle
	 * 
	 * static field how many bottles are in the machine
	 * final field how many a cola costs
	 * 
	 * method to subtract 1 from total bottles field
	 * method to buy a bottle
	 * method to display how much a bottle costs and how much the client was charged
	 * method to restock bottles
	 * 
<<<<<<< HEAD
	 * display how many bottles are left
	 * display how many bottles are restocked
	 */
	
	private int bottlesInventory = 100;
	private final int machineInventoryLimit = 200;
	private double price = new ColaBottle().getColaPrice();
	
	// Default constructor 
	public ColaVendingMachine () {}
	
	// Constructor that creates vending machine object with initial inventory
	public ColaVendingMachine (int bottlesInventory) {
		setBottleInventory(bottlesInventory);
	}
	
	// Getther for bottle inventory
	public int getBottleInventory () {
		return bottlesInventory;
	}
	
	// Setter for bottle inventory
	public void setBottleInventory (int bottlesInventory) {
		this.bottlesInventory = bottlesInventory;
	}
	
	// Subtract the number of bought bottles from the machine's inventory
=======
	 * dispaly how many bottles are left
	 * display how many bottles are restocked
	 */
	
	private static int bottlesInventory = 100;
	private static int machineInventoryLimit = 200;
	private double price = new ColaBottle().getColaPrice();
	
	public ColaVendingMachine () {}
	
>>>>>>> master
	public void SubtractBottlesInventory(int bottlesBought) {
		bottlesInventory -= bottlesBought;
	}
	
<<<<<<< HEAD
	// Dispaly bottle price, total purchase cost and invoke SubtractBottlesInventory method
=======
>>>>>>> master
	public void BuyBottle (int bottlesBought) {
		System.out.printf("Customer bought %s bottles of cola.%n",bottlesBought);
		System.out.printf("One bottle of cola costs: $%s%n", price);
		System.out.println("Customer was charged: $" + String.format("%1$.2f.", bottlesBought * price));
		SubtractBottlesInventory(bottlesBought);
	}
	
<<<<<<< HEAD
	// Restock the machine. If restocking amount exceeds machine limit, display message. Else set iventory.
	public void Restcok (int bottlesRestocked) {
		if (bottlesRestocked + getBottleInventory() > machineInventoryLimit) {
			System.out.println("Vending machine can only hold 200 bottles. Limit exceeded.");
			return;
		}
		setBottleInventory(bottlesRestocked + getBottleInventory());
	}
	
	// Display current inventory.
	public void DisplayInventory () {
		System.out.println("The vending machine currently has: " + getBottleInventory() + " bottles left");
	}
	
		
=======
	// PERFORM CHECKS HERE ??
	public void Restcok (int bottlesRestocked) {
		bottlesInventory += bottlesRestocked;
	}
	
	public void DisplayInventory () {
		System.out.println("The vending machine currently has: " + bottlesInventory + " bottles left");
	}
	
	// TO DO: PERFORM CHECKS HERE ?
	private boolean CheckInventoryLimit () {
		if (machineInventoryLimit > 200) {
			return true;
		}
		return false;
	}
	
	
>>>>>>> master
	public static void main(String[] args) {
		ColaVendingMachine cvm = new ColaVendingMachine();
		cvm.DisplayInventory();
		cvm.BuyBottle(10);
		cvm.DisplayInventory();
		
		System.out.println("--- Restocking machine ---");
<<<<<<< HEAD
		cvm.Restcok(20);
=======
		cvm.Restcok(150);		// TO DO: Add limit to restocking or to the vending machine.
>>>>>>> master
		cvm.DisplayInventory();
	}
	
}
