import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
	
	public int LetterToPercent (String letter) {
		Set<Map.Entry<String, Integer>> mapEntrySet = letterGrades.entrySet();
		Iterator<Entry<String, Integer>> mapEntrySetIterator = mapEntrySet.iterator();
		
		while (mapEntrySetIterator.hasNext()) {
			Entry entry = mapEntrySetIterator.next();
			if (entry.getKey().equals(letter)))	{
				return entry.getValue();
			}
		}
	}
	
	private void letterHashMap() {
		int maxScore = 100;
		String[] grades = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
		for(String grade : grades) {
			if (grade.equals("A+")) {
				for (int i = 100; i >= 97; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("A")) {
				for (int i = 96; i >= 93; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("A-")) {
				for (int i = 92; i >= 90; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("B+")) {
				for (int i = 89; i >= 87; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("B")) {
				for (int i = 86; i >= 83; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("B-")) {
				for (int i = 82; i >= 80; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("C+")) {
				for (int i = 79; i >= 77; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("C")) {
				for (int i = 76; i >= 73; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("C-")) {
				for (int i = 72; i >= 70; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("D+")) {
				for (int i = 69; i >= 67; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("D")) {
				for (int i = 66; i >= 63; i--) {
					letterGrades.put(grade, i);
				}
			}
			else if (grade.equals("D-")) {
				for (int i = 62; i >= 60; i--) {
					letterGrades.put(grade, i);
				}
			}
			else {
				for (int i = 59; i >= 0; i--) {
					letterGrades.put(grade, i);
				}
			}
		}		
		}

	
	public int calculateAverage(T[] grade) {
		LetterGrade<String> grade1 = new LetterGrade<String>();
		return 0;
	}
}
