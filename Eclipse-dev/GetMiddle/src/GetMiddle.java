//https://www.codewars.com/kata/get-the-middle-character/train/java



public class GetMiddle {

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));

	}
	
	
	public static String getMiddle(String word) {
		int middle = (word.length()) / 2;
		StringBuilder newString = new StringBuilder();
		
		if (middle % 2 == 0) {
			newString.append(word.charAt(middle - 1));
			newString.append(word.charAt(middle));
			return newString.toString();
		}
		return newString.append(word.charAt(middle)).toString();
	  }

}
