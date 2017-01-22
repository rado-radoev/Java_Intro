
public class Animal {
	
	private String name = null;
	private double height = 0;
	private int age = 0;
	
	public Animal (String name, double height, int age) {
		setName(name);
		setHeight(height);
		setAge(age);
	}
	
	// Get Animal name
	public String getName(String name) {
		return name;
	}
	
	// Set Animal name
	public void setName(String name) {
		this.name = name;
	}
	
	// Get Animal height
	public double getHeight (double height) {
		return height;
	}
	
	// Set Animal height
	public void setHeight (Double height) {
		this.height = height;
	}
	
	// Get Animal age
	public int getAge (int age) {
		return age;
	}
	
	// Set Animal age
	public void setAge (int age) {
		this.age = age;
	}
}
