/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */
public class Giraffe extends Animal {

	// Giraffe constructor inheriting SuperConstrucotr
	public Giraffe(String name, double height, int age) {
		super(name, height, age);
	}
	
	public void Walk (int steps) {
		System.out.printf("%s is walking %s steps",this.getClass().getSimpleName(),steps);
	}

	public static void main(String[] args) {
		Giraffe giro = new Giraffe("Giro", 280.5, 15);
		giro.Walk(5);

	}

}
