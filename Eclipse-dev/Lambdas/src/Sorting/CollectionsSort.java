package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionsSort {

	public static void main(String[] args) {
		String[] players = {
				"Rafael Nadal",
				"Novak Djokovic", 
				"Stanislas Wawrinka", 
				"David Ferrer", 
				"Roger Federer", 
				"Andy Murray", 
				"Tomas Berdych", 
				"Juan Martin Del Potro", 
				"Richard Gasquet", 
				"John Isner"
			};
		
/*		// Sort players by name using anonymous inner class
		Arrays.sort(players, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
						
			}		
		});
		
		for (String s : players) {
			System.out.println(s);
		}*/
		
		// Sort player names by using lambda
/*		Comparator<String> sortByName = (String s1, String s2) -> s1.compareTo(s2);
		Arrays.sort(players, sortByName);*/

		
/*		Arrays.sort(players, (String s1, String s2) -> s1.compareTo(s2));
		for (String s : players) {
			System.out.println(s);
		}*/
		
		// Sort by surname using anonymous inner class
/*		Arrays.sort(players, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
			}		
		});*/
		
		// Sort players by surname using lambda
/*		Comparator<String> sortBySurname = (s1, s2) -> s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")));
		Arrays.sort(players, sortBySurname);*/
		
		
		// Sort players by lenght of name using innerClass
/*		Arrays.sort(players, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
			
		});*/
		
		// Sort players by name using lambda
/*		Comparator<String> sortByNameLength = (s1, s2) -> s1.length() - s2.length();
		Arrays.sort(players, sortByNameLength);*/
		
/*		Arrays.sort(players, (s1, s2) -> s1.length() - s2.length());*/
		
		// Sort by length of first name
/*		Arrays.sort(players, (s1, s2) -> s1.substring(0, s1.indexOf(" ")).length() -
				s2.substring(0, s2.indexOf(" ")).length());*/
		
		// Sort players by last letter using inner Class
		Arrays.sort(players, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
			}
			
		});
		
		for (String s : players) {
			System.out.println(s);
		}
	}

}
