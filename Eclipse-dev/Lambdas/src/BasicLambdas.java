import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class BasicLambdas {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Rado", "Viki", "Stefcho", "Valya", "Yotko", "Ogi");
		list.sort(String::compareTo);

	}
	
	

}
