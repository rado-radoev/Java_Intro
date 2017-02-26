import java.nio.file.AccessDeniedException;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
		String[] arr = {"", "Bye"};
		System.out.println(isNotNull(arr, s -> arr[1] == null || arr[0].equals("") ? true : false));

	}
	
	public static boolean isNotNull(String[] input, Predicate<String> predicate) {
		return predicate.test(input[0]);
	}

}
