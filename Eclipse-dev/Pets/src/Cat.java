
public class Cat extends Pet{
	
	public Cat (String name) {
		super(name);
	}

	public void SayMiow () {
		System.out.printf("%s says miow\n",getName());
	}
	
	public void CatchFish () {
		System.out.printf("%s cought a fish\n",getName());
	}
	
	public void Sleep () {
		System.out.printf("%s is a sleep\n", getName());
	}
}
