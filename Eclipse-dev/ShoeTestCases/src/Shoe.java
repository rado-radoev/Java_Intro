
public class Shoe {
	/**
	 * Setting size and color attributes
	 */
	private int size;
	private String color;
	
	/**
	 * Shoe object constructor
	 * @param size		Sets shoe size
	 * @param color		Sets shoe color
	 */
	public Shoe(int size, String color) {
		super();
		setSize(size);
		setColor(color);
	}

	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}



	/**
	 * Prints shoe size
	 */
	public void showSize() {
		System.out.println("Size: " + this.size);
	}
	
	/**
	 * Prints shoe color
	 */
	public void showColor() {
		System.out.println("Color: " + this.color);
	}
}