import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
		fillHashMap();
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
	
	@Override
	public int calculateAverage(T[] grade) {
		
		return 0;
	}
	
	
	public String PercentToLetter(int percent) throws InvalidAttributeValueException {
		Iterator<Integer> keySetIterator = percentageGrades.keySet().iterator();
		while(keySetIterator.hasNext()) {
			int grade = keySetIterator.next();
			if (grade == percent) {
				return percentageGrades.get(grade);
			}
		}
		throw new InvalidAttributeValueException("Invalid grade supplied to PercentToLetter");
	}
	
	
	private void fillHashMap() {
		int maxScore = 100;
		for (int i = maxScore; i > 0; i--) {
			if (i >= 97) {
				percentageGrades.put(i, "A+");
			}
			else if (i >= 93 && i <= 96) {
				percentageGrades.put(i, "A");
			}
			else if (i >= 90 && i <= 92) {
				percentageGrades.put(i, "A-");
			}
			else if (i >= 87 && i <= 89) {
				percentageGrades.put(i, "B+");
			}
			else if (i >= 83 && i <= 86) {
				percentageGrades.put(i, "B");
			}
			else if (i >= 80 && i <= 82) {
				percentageGrades.put(i, "B-");
			}
			else if (i >= 77 && i <= 79) {
				percentageGrades.put(i, "C+");
			}
			else if (i >= 73 && i <= 76) {
				percentageGrades.put(i, "C");
			}
			else if (i >= 70 && i <= 72) {
				percentageGrades.put(i, "C-");
			}
			else if (i >= 67 && i <= 69) {
				percentageGrades.put(i, "D+");
			}
			else if (i >= 63 && i <= 66) {
				percentageGrades.put(i, "D");
			}
			else if (i >= 60 && i <= 62) {
				percentageGrades.put(i, "D-");
			}
			else {
				percentageGrades.put(i, "F");
			}
		}
	}
	
}
