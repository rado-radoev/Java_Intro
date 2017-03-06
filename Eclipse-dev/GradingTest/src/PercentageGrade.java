import java.util.HashMap;
import java.util.Iterator;

import javax.management.InvalidAttributeValueException;

public class PercentageGrade<T> implements Grade<T>{

	private int grade;
	private HashMap<Integer, String> percentageGrades = new HashMap<Integer, String>();

	/**
	 * @param percentage
	 */
	public PercentageGrade(int grade) {
		super();
		setGrade(grade);
		percentHashMap();
	}

	/**
	 * @return the percentageGrade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param percentageGrade the percentageGrade to set
	 */
	public void setGrade(int percentageGrade) {
		this.grade = percentageGrade;
	}
	
	@Override
	public String toString() {
		return Integer.toString(grade);
	}
	
	@Override
	public boolean isPass() {
		if (this.getGrade() > 59) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public boolean includeInAverage() {
		return true;
	}
	
	
	public int calculateAverage(int[] grade) {
		int sum = 0;
		for (Integer i : grade) {
			sum += i;
		}
		return sum / grade.length;
	}
	
	
	public String toPercent(int percent) throws InvalidAttributeValueException {
		Iterator<Integer> keySetIterator = percentageGrades.keySet().iterator();
		while(keySetIterator.hasNext()) {
			int grade = keySetIterator.next();
			if (grade == percent) {
				return percentageGrades.get(grade);
			}
		}
		throw new InvalidAttributeValueException(
				"Invalid grade supplied to method PercentToLetter(int percent)"
				);
	}
	
	
	private void percentHashMap() {
		int maxScore = 100;
		for (int i = maxScore; i > 0; i--) {
			if (i >= 90 && i <= 100) {
				percentageGrades.put(i, "A");
			}
			else if (i >= 80 && i <= 89) {
				percentageGrades.put(i, "B");
			}
			else if (i >= 70 && i <= 79) {
				percentageGrades.put(i, "C");
			}
			else if (i >= 60 && i <= 69) {
				percentageGrades.put(i, "D");
			}
			else {
				percentageGrades.put(i, "F");
			}
			
		}
	}
	
}
