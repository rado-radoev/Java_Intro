
public abstract class AbstractTest {
	
	public String filedae;

	public abstract void eat();
	
	public void sleep() {
		System.out.println("This animal is: " + getClass().getSimpleName());
	}
}
