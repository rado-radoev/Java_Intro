import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

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
		String nativeGrade = Integer.toString(grade);
		return nativeGrade;
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
	
	
	public T toPercent(T grade) throws InvalidAttributeValueException {
		int gr = Integer.parseInt(grade.toString());
		Iterator<Integer> keySetIterator = percentageGrades.keySet().iterator();
		while(keySetIterator.hasNext()) {
			int nextGrade = keySetIterator.next();
			if (nextGrade == gr) {
				return (T) percentageGrades.get(nextGrade);
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
