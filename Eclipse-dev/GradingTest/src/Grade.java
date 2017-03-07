//import javax.management.InvalidAttributeValueException;

public interface Grade {
	public String toString(); // Prints the grade in its native format
	public boolean isPass();  // Returns true for passing grade, otherwise returns false
	public boolean includeInAverage(); // Returns true for letter and numeric grades, but false for pass/fail grades
//	public int toPercent() throws InvalidAttributeValueException; // Returns the grade as a percentage integer between 0 and 100
}
