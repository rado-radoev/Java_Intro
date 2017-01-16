
public class RunningShoe extends Shoe {

	public RunningShoe(int size, String color) {
		super(size, color);
	}

	public static void main(String[] args) {
		RunningShoe rs = new RunningShoe(12, "Orange");
		rs.showSize();
		rs.showColor();
	}


}
