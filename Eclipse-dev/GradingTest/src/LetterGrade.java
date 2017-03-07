import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class LetterGrade implements Grade {

	private String grade;
	private HashMap<String, Integer> letterGrades = new HashMap<String, Integer>(); // KV pair of letter grades and their percent representation

	/**
	 * Parameterized constructor
	 * @param grade
	 */
	public LetterGrade(String grade) {
		super();
		setGrade(grade);
		letterHashMap();
	}


	/**
	 * Default Constructor
	 * Starting grade is F
	 */
	public LetterGrade() {
		this("F");
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

	/**
	 * Default representation of the grade object - Letters are presented as strings
	 * @return Letter grade as string
	 */
	@Override
	public String toString() {
		return getGrade();
	}

	/**
	 * If the letter is passing grade returns true, else false
	 * @return boolean
	 */
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

	/**
	 * Letter grades can be included in the average
	 * @return true
	 */
	@Override
	public boolean includeInAverage() {
		return true;
	}



	/**
	 * Method that returns the percent representation of a letter grade
	 * Method uses HashMap to iterate through all the keys (Letter Grades) and
	 * find what is the respective percent
	 * @param grade Letter grade as String
	 * @return Letter grade in percentage representation of Integer type
	 */
	public int toPercent() {
		Set<Map.Entry<String, Integer>> mapEntrySet = letterGrades.entrySet();
		Iterator<Entry<String, Integer>> mapEntrySetIterator = mapEntrySet.iterator();

		while (mapEntrySetIterator.hasNext()) {
			Entry<String, Integer> entry = mapEntrySetIterator.next();
			if (entry.getKey().equals(getGrade())) {
				 return entry.getValue();
			}
		}
		return 0;
	}



	/**
	 * Private method that is used once to instantiate the Letter Grade hash map
	 */
	private void letterHashMap() {
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
}
