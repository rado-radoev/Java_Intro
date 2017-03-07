import java.util.ArrayList;

import javax.management.InvalidAttributeValueException;

public class PassFailGrade implements Grade {

	private boolean grade;

	/**
	 * Parameterized Constructor
	 * @param grade
	 */
	public PassFailGrade(boolean grade) {
		super();
		setGrade(grade);
	}

	/**
	 * Default constructor
	 * Grade is false by default
	 */
	public PassFailGrade() {
		this(false);
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

	/**
	 * String representation of the grade
	 */
	@Override
	public String toString() {
		return Boolean.toString(isGrade());
	}

	/**
	 * Method to return if the grade is passing or not
	 * @return boolean
	 */
	@Override
	public boolean isPass() {
		return isGrade();
	}

	/**
	 * Pass Fail grade cannot be included in an average
	 * @return false
	 */
	@Override
	public boolean includeInAverage() {
		return false;
	}

	/**
	 * Method returns the pass fail grade as percentage
	 * @return the pass or fail as Integer 0 - Fail, 100 - Pass
	 */
	// public int toPercent(String grade) throws InvalidAttributeValueException {
	// 	int maxPercent = 100;
	// 	int minPercent = 0;
	// 	if (isPass()) {
	// 		return maxPercent;
	// 	}
	// 	return minPercent;
	// }

	public int toPercent() {
		int maxGrade = 100;
		int minGrade = 0;

		if (isPass()) {
			return maxGrade;
		}
		return minGrade;

	}



}
