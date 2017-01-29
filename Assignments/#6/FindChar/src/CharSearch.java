import java.util.Iterator;

public class CharSearch {

	public static void main(String[] args) {
		// Define variables
		boolean found = false;
		char charSearch = 'a';
		String strSearch = "This class is awesome";
		
		// Search for char in string
		for (int i = 0; i < strSearch.length(); i++) {
			char result = strSearch.charAt(i);
			
			if (result == charSearch) {
				System.out.printf("Character found at index %s!", i);
				found = true;
				break;
			}
		}
		
		// Display message if characte is not found in string
		if (!found) {
			System.out.println("Char not found!");
		}
	}

}
