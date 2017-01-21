
public class LamdaDemo2 {
	public static void main(String[] args) {
		System.out.println("== Runnable Test ==");
		
		// Annonymous runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};
		
		// Lambda runnable
		Runnable r2 = () -> System.out.println("Hello world two!");
		
		// Run em!
		r1.run();
		r2.run();
	}
}
