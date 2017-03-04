
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
		if (this.isGrade()) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean includeInAverage() {
		return false;
	}

	@Override
	public int calculateAverage(T[] grade) {
		// TODO Auto-generated method stub
		return 0;
	}
}
