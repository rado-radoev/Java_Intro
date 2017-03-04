
public class LetterGrade<T> implements Grade<T> {
	
	private String grade;

	/**
	 * @param grade
	 */
	public LetterGrade(String grade) {
		super();
		setGrade(grade);
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return this.grade.toString();
	}

	@Override
	public boolean isPass() {
		switch (this.getGrade()) {
		case "A+":
		case "A":
		case "A-":
		case "B+":
		case "B":
		case "B-":
		case "C+":
		case "C":
		case "C-":
		case "D+":
		case "D":
		case "D-":
			return true;
		case "E":
		case "F":
			return false;
		default:
			return false;
		}
	}
	
	@Override
	public boolean includeInAverage() {
		return true;
	}
	

	@Override
	public int calculateAverage(T[] grade) {
		// TODO Auto-generated method stub
		return 0;
	}

}
