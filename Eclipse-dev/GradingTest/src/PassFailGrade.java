import javax.management.InvalidAttributeValueException;

public class PassFailGrade<T> implements Grade<T> {

	private boolean grade;
	
	public PassFailGrade(boolean grade) {
		super();
		setGrade(grade);
	}

	/**
	 * @return the grade
	 */
	public boolean isGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(boolean grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return Boolean.toString(grade);
	}
	
	@Override
	public boolean isPass() {
		return isGrade();
	}
	
	@Override
	public boolean includeInAverage() {
		return false;
	}

	@Override
	public T toPercent(T grade) throws InvalidAttributeValueException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
