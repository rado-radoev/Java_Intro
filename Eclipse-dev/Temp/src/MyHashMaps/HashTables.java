package MyHashMaps;
import java.util.HashMap;
import java.util.Map;

public class HashTables {

	public static void main(String[] args) {
		Map<String, Double> studentsMarks = new HashMap<String, Double>(6);
		studentsMarks.put("Pesho", 3.00);
		studentsMarks.put("Gosho", 4.50);		
		studentsMarks.put("Nakov", 5.50);
		studentsMarks.put("Vesko", 3.50);
		studentsMarks.put("Tsanev", 4.00);
		studentsMarks.put("Nerdy", 6.00);
		
		Double tsanevMark = studentsMarks.get("Tsanev");
		System.out.printf("Tsanev's mark: %.2f %n", tsanevMark);
		
		studentsMarks.remove("Tsanev");
		System.out.println("Tsanev removed.");
		
		System.out.printf("Is Tsanev in the hash table: %b %n",
				studentsMarks.containsKey("Tsanev"));
		
		studentsMarks.put("Nerdy", 3.25);
		System.out.println("Nerdy's mark changed");
	
		System.out.println("Students and marks: ");
		
		System.out.println(studentsMarks.entrySet());
		System.out.println(studentsMarks.hashCode());

		
		
		
		for (Map.Entry<String, Double> studentMark : studentsMarks.entrySet()) {
			System.out.printf("%s has %.2f%n", studentMark.getKey(), studentMark.getValue());
		}
		
		System.out.printf("There are %d students.%n", studentsMarks.size());
		studentsMarks.clear();
		System.out.println("Students has map cleared");
		
		System.out.printf("Is has table empty: %b%n", studentsMarks.isEmpty());
	}
	


}
