import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		// Create diff grade obejct to add to array
//		LetterGrade lt = new LetterGrade("A");
//		PercentageGrade pg = new PercentageGrade(90);
//		PassFailGrade pfg = new PassFailGrade(false);
		
		// Creaet grade array and add objects
		ArrayList<Grade> arr = new ArrayList<>(); 
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
		
		
		
		// Creaet array to hold all the grades in percentage
		// will be used to calculate the average grade
		ArrayList<Integer> avgGrades = new ArrayList();
		
		// Iterate through all grade objects
		System.out.println("Grade |\tP/F |\tPercentage");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i).toString() + "\t");
			if (arr.get(i).isPass()) {
				System.out.print("PASS\t");
			}
			else {
				System.out.print("FAIL\t");
			}
			
			
			if (arr.get(i).includeInAverage()) {
				System.out.print(arr.get(i).toPercent());
				
			}
			avgGrades.add(arr.get(i).toPercent());
			System.out.println();
		}
		
		
		int sum = 0;
		for (Integer i : avgGrades) {
			sum += i;
		}
		
		System.out.println("\nThe average of all grades is: " + (sum / avgGrades.size()));
			
	}
	
}

