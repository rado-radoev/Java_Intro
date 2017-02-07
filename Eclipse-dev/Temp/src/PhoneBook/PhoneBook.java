package PhoneBook;
import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		TreeMap<String, String> phoneBook = new TreeMap<String, String>();
		
		phoneBook.put("Sue", "5789637895");
		phoneBook.put("Zoe", "8584659875");
		
		String number = phoneBook.get("Zoe");
		//System.out.println(number);
		
		for (String s : phoneBook.keySet()) {
			System.out.println(phoneBook.get(s));
		}
	}

}
