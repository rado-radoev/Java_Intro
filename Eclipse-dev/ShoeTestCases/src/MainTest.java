
public class MainTest {

	public static void main(String[] args) throws AssertionError {
		Shoe dressShoe = new DressShoe(0, null);
		Shoe runningShoe = new RunningShoe(10, "Black");
		
		ShoeSize(dressShoe);
		ShoeSize(runningShoe);
		
		ShoeColorIsNull(dressShoe);
		ShoeColorIsNull(runningShoe);

	}
	
	/**
	 * Test if shoe has a correct size
	 * @param shoe	shoe object to test
	 */
	private static void ShoeSize(Shoe shoe) {
		String currentMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			assert shoe.getSize() > 0;
			System.out.println(currentMethod + " Test for " + shoe.getClass() + " - PASS");
		}
		catch (AssertionError ae) {
			System.out.println(currentMethod + " Test for " + shoe.getClass() + " - FAIL");

		}
	}
	
	
	/**
	 * Checks if shoe color is correct
	 * @param shoe	shoe object to test
	 */
	private static void ShoeColorIsNull (Shoe shoe) {
		String currentMethod = Thread.currentThread().getStackTrace()[1].getMethodName();
		if (shoe.getColor() == null) {
			System.out.println(currentMethod + " Test for " + shoe.getClass() + " - FAIL");
		}
		else {
			System.out.println(currentMethod + " Test for " + shoe.getClass() + " - PASS");
		}
	}

}
