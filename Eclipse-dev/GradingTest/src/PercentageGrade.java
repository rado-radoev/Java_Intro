import java.util.HashMap;
import java.util.Iterator;

public class PercentageGrade implements Grade {

	private int grade;
	private HashMap<Integer, String> percentageGrades = new HashMap<Integer, String>(); // KV pair of percentage grades and their letter representation

	/**
	 * Parameterized Constructor
	 * @param percentage
	 */
	public PercentageGrade(int grade) {
		super();
		setGrade(grade);
		percentHashMap();
	}


	/**
	 * Default Constructor
	 * Sets grade to 0 by default
	 */
	public PercentageGrade() {
		this(0);
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

	/**
	 * @return Returns percent grade as string
	 */
	@Override
	public String toString() {
		return Integer.toString(getGrade());
	}

	/**
	 * Check if percentage grade is Passing or Failing
	 * @return boolean
	 */
	@Override
	public boolean isPass() {
		if (this.getGrade() > 59) {
			return true;
		}
		return false;
	}

	/**
	 * Percentage grade can be included in the average
	 * @return true
	 */
	@Override
	public boolean includeInAverage() {
		return true;
	}


	/**
	 * Converts percentage grade to letter grade
	 * @param grade as Integer
	 * @return grade as String
	 * @throws InvalidAttributeValueException
	 */
	 public String toLetter() {
	 	Iterator<Integer> keySetIterator = percentageGrades.keySet().iterator();
	 	while(keySetIterator.hasNext()) {
	 		int nextGrade = keySetIterator.next();
	 		if (nextGrade == getGrade()) {
	 			return percentageGrades.get(nextGrade);
	 		}
	 	}
	 	return "F";
	 }

	/**
	 * Returns the grade as percent
	 * @return int representation of the grade
	 */
	@Override
	public int toPercent () {
		return getGrade();
	}

	/**
	 * Private method that instantiates the percentage HashMap on
	 * object creation
	 */
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
