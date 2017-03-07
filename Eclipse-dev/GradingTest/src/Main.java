import java.util.ArrayList;

import javax.management.InvalidAttributeValueException;

public class Main {

	public static void main(String[] args) throws InvalidAttributeValueException {
		
		// Crate letter grade object
		LetterGrade lt = new LetterGrade("A");
		// Create percentage grade object
		PercentageGrade pg = new PercentageGrade(90);
		// Create pass fail object
		PassFailGrade pfg = new PassFailGrade(true);
		
		// Empty array list that will hold grade objects
		ArrayList<Object> arr = new ArrayList<>();
		// Empty array that will hold all grades as percentages so it will calclate the average sum
		ArrayList<Integer> avgGrades = new ArrayList<>(); 
		int sum = 0;
		
		// Add grade objects to array
		arr.add(lt);
		arr.add(pg);
		arr.add(pfg);
		
		// Iterate through objects 
		for (int i = 0; i < arr.size(); i++) {
			Object grade = arr.get(i);
			// If the grade is of type Letter Grade
			if (grade.getClass().getName() == LetterGrade.class.getName()) {
				// Cast grade object to Letter Grade class
				LetterGrade letterGrade = LetterGrade.class.cast(grade);
				if (letterGrade.isPass()) {
					System.out.print(letterGrade.toString() + " PASS " +
					letterGrade.toPercent(letterGrade.toString()));
				}
				else {
					System.out.print(letterGrade.toString() + " FAIL " +
							letterGrade.toPercent(letterGrade.toString()));
				}
				// Add to average grades array
				avgGrades.add(letterGrade.toPercent(letterGrade.toString()));
				System.out.println("\n");
			}
			// If the grade is of type Percentage Grade
			else if (grade.getClass().getName() == PercentageGrade.class.getName()) {
				// Cast grade object to Percentage Grade class
				PercentageGrade percentGrade = PercentageGrade.class.cast(grade);
				if (percentGrade.isPass()) {
					System.out.print(percentGrade.toString() + " PASS " +
							percentGrade.getGrade());
				}
				else {
					System.out.print(percentGrade.toString() + " FAIL " +
							percentGrade.getGrade());
				}
				// Add to average grades array
				avgGrades.add(percentGrade.getGrade());
				System.out.println("\n");
			} else {
				// If the grade is of type Pass Fail Grade
				// Cast grade object to Pass Fail Grade class
				PassFailGrade passFailGrade = PassFailGrade.class.cast(grade);
				if (passFailGrade.isPass()) {
					System.out.print(passFailGrade.toString() + " PASS " +
							passFailGrade.toPercent(passFailGrade.toString()));
				}
				else {
					System.out.print(passFailGrade.toString() + " FAIL " +
							passFailGrade.toPercent(passFailGrade.toString()));
				}
				// Add to average grades array
				avgGrades.add(passFailGrade.toPercent(passFailGrade.toString()));
				System.out.println("\n");
			}
		}
		
		for (int i = 0; i < avgGrades.size(); i++) {
			sum += avgGrades.get(i);
		}
		
		System.out.println("Sum is: " + sum /  avgGrades.size());
	}
}		
		

		


