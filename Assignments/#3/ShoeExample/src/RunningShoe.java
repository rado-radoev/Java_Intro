
public class RunningShoe extends Shoe {

	/**
	 * Running Shoe class
	 * @param size		Running shoe size
	 * @param color		Running shoe color
	 */
	public RunningShoe(int size, String color) {
		super(size, color);
	}

	public static void main(String[] args) {
		RunningShoe rs = new RunningShoe(12, "Orange");
		rs.showSize();
		rs.showColor();
	}


}
