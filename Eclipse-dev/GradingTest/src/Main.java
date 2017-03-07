import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		// Create array to hold all the grades in percentage
		// will be used to calculate the average grade
		ArrayList<Integer> avgGrades = new ArrayList<Integer>();

		// Create grade array and add objects
		ArrayList<Grade> arr = new ArrayList<Grade>(); 
		arr.add(new LetterGrade("A"));
		arr.add(new LetterGrade("B"));		
		arr.add(new LetterGrade("C"));		
		arr.add(new LetterGrade("F"));		
		arr.add(new PercentageGrade(90));		
		arr.add(new PercentageGrade(100));
		arr.add(new PercentageGrade(100));		
		arr.add(new PercentageGrade(20));		
		arr.add(new PassFailGrade(false));
		arr.add(new PassFailGrade(true));
		arr.add(new PassFailGrade(true));
		arr.add(new PassFailGrade(false));
		

		System.out.println("Grade |\tP/F |\tPercentage");
		
		// Iterate through all grade objects
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i).toString() + "\t");
			// If grade is passing print PASS
			if (arr.get(i).isPass()) {
				System.out.print("PASS\t");
			}
			// If grade is passing print FAIL
			else {
				System.out.print("FAIL\t");
			}
			
			// Display grade percentage only if it can be included in Average
			if (arr.get(i).includeInAverage()) {
				System.out.print(arr.get(i).toPercent());
				
				// Add grades to Average Grades array for later calculation
				avgGrades.add(arr.get(i).toPercent());
			} 
			System.out.println();
		}
		
		// Print the class average grade
		System.out.println("\nThe average of all grades is: " + calculateAverage(avgGrades));
			
	}
	
	/**
	 * Method that calculates the average grades
	 * @param averageGrades	ArrayList of Integers
	 * @return the average grade as an Integer
	 */
	public static int calculateAverage(ArrayList<Integer> averageGrades) {
		int sum = 0;
		for (Integer i : averageGrades) {
			sum += i;
		}
		
		return sum / averageGrades.size();
	}
}

