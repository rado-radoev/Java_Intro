package MyLambdas;

public class MyLambdaPerson {
	
	private String firstName;
	private String lastName;
	private int age;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public MyLambdaPerson(String firstName, String lastName, int age) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person[firstname= " + firstName +
				", lastname= " + lastName + 
				", age= " + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
