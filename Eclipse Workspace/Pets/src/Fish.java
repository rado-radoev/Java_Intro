
public class Fish extends Pet{


	public Fish (String name) {
		super(name);
	}
	
	public void Swim () {
		System.out.printf("%s is swinning in the Pacific", getName());
	}
	
	public void Eat () {
		System.out.printf("%s is eating", getName());
	}
}
