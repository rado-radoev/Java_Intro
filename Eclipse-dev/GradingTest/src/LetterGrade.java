import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.InvalidAttributeValueException;

import java.util.Set;

public class LetterGrade<T> implements Grade<T> {
	
	private String grade;
	private HashMap<String, Integer> letterGrades = new HashMap<String, Integer>();

	/**
	 * @param grade
	 */
	public LetterGrade(String grade) {
		super();
		setGrade(grade);
		letterHashMap();
	}
	
	public LetterGrade() {
		
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
		case "A":
		case "B":
		case "C":
		case "D":
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
	
	public T toPercent (T letter) throws InvalidAttributeValueException {
		Set<Map.Entry<String, Integer>> mapEntrySet = letterGrades.entrySet();
		Iterator<Entry<String, Integer>> mapEntrySetIterator = mapEntrySet.iterator();
		
		while (mapEntrySetIterator.hasNext()) {
			Entry entry = mapEntrySetIterator.next();
			if (entry.getKey().equals(letter))	{
				return (T)entry.getValue();
			}
		}
		throw new InvalidAttributeValueException(
				"Invalid grade supplied to method LetterToPercent (String letter)"
				);
	}
	
	private void letterHashMap() {
		int maxScore = 100;
		String[] grades = {"A", "B", "C", "D", "F"};
		for(String grade : grades) {
			if (grade.equals("A")) {
				letterGrades.put(grade, 100);
			}
			else if (grade.equals("B")) {	
					letterGrades.put(grade, 89);
				}
			else if (grade.equals("C")) {
					letterGrades.put(grade, 79);
				}
			else if (grade.equals("D")) {
					letterGrades.put(grade, 69);
			}
			else {
				letterGrades.put(grade, 0);
			}
		}
	}

	
	public int calculateAverage(T[] grade) {
		LetterGrade<String> grade1 = new LetterGrade<String>();
		return 0;
	}
}
