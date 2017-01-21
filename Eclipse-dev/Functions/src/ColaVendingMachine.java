
public class ColaVendingMachine {
	
	// Vending machine attributes
	private int bottlesInventory = 100;
	private final int machineInventoryLimit = 200;
	private double price = new ColaBottle().getColaPrice();
	
	// Default constructor 
	public ColaVendingMachine () {}
	
	// Constructor that creates vending machine object with initial inventory
	public ColaVendingMachine (int bottlesInventory) {
		setBottleInventory(bottlesInventory);
	}
	
	// Getter for bottle inventory
	public int getBottleInventory () {
		return bottlesInventory;
	}
	
	// Setter for bottle inventory
	public void setBottleInventory (int bottlesInventory) {
		this.bottlesInventory = bottlesInventory;
	}
	
	// Subtract the number of bought bottles from the machine's inventory
	public void SubtractBottlesInventory(int bottlesBought) {
		bottlesInventory -= bottlesBought;
	}
	

	// Display bottle price, total purchase cost and invoke SubtractBottlesInventory method
	public void BuyBottle (int bottlesBought) {
		System.out.printf("Customer bought %s bottles of cola.%n",bottlesBought);
		System.out.printf("One bottle of cola costs: $%s%n", price);
		System.out.println("Customer was charged: $" + String.format("%1$.2f.", bottlesBought * price));
		SubtractBottlesInventory(bottlesBought);
	}
	

	// Restock the machine. If restocking amount exceeds machine limit, display message. Else set iventory.
	public void Restcok (int bottlesRestocked) {
		if (bottlesRestocked + getBottleInventory() > machineInventoryLimit) {
			System.out.println("Vending machine can only hold 200 bottles. Inventory limit exceeded. ");
			System.out.println("You can only load " + (machineInventoryLimit - getBottleInventory()) +  " bottles");
			return;
		}
		setBottleInventory(bottlesRestocked + getBottleInventory());
	}
	
	// Display current inventory.
	public void DisplayInventory () {
		System.out.println("The vending machine currently has: " + getBottleInventory() + " bottles left");
	}
	

	public static void main(String[] args) {
		ColaVendingMachine cvm = new ColaVendingMachine();
		cvm.DisplayInventory();
		cvm.BuyBottle(10);
		cvm.DisplayInventory();
		
		System.out.println("\n--- Restocking machine ---\n");

		cvm.Restcok(150);
		cvm.DisplayInventory();
	}
	
}
