
public class Giraffe {

	/**
	 * Create a class Giraffe which stores the height, age, and name of the Giraffe. 
	 * Add acessor methods which show those values but also let you change them. 
	 * Write another method walk which takes a number of steps and prints “Giraffe is walking X steps
	 */
	
	private String name;
	private double height;
	private int age;
	
	public Giraffe (String name, double height, int age) 
	{
		super();
		setName(name);
		setHeight(height);
		setAge(age);
	}
	
	// Get Giraffe name
	public String getName(String name) {
		return name;
	}
	
	// Set Giraffe name
	public void setName(String name) {
		this.name = name;
	}
	
	// Get Giraffe height
	public double getHeight (double height) {
		return height;
	}
	
	// Set Giraffe height
	public void setHeight (Double height) {
		this.height = height;
	}
	
	// Get Giraffe age
	public int getAge (int age) {
		return age;
	}
	
	// Set Giraffe age
	public void setAge (int age) {
		this.age = age;
	}
	
	public void Walk (int steps) {
		System.out.printf("Giraffe is walking %s steps",steps);
	}
	
	public static void main(String[] args) {
		Giraffe giro = new Giraffe("Giro", 155.5, 41);
		giro.Walk(5);
	}
}
