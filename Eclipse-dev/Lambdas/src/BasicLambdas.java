import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class BasicLambdas {

	public static void main(String[] args) {

		String[] names = {"Rado", "Viki", "Stefcho", "Valya", "Yotko", "Ogi"};
		List<String> family = Arrays.asList(names);
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		});
		
		Comparator<String> sortByLenght = (String s1, String s2) -> s1.length() - s2.length();
		Arrays.sort(names, sortByLenght);
		
		
	}
	
	

}
