
public class DressShoe extends RunningShoe {

	public DressShoe(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void showSize() {
		System.out.println("Dress Shoe Size: " + this.size);
	}



	public static void main(String[] args) {
		DressShoe d = new DressShoe(12);
		d.showSize();
	}

}
