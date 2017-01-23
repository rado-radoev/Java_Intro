package Lamdas;
@FunctionalInterface
interface MyLambda {
	void foo();
}

@FunctionalInterface
interface MyAdd {
	int sum(int a, int b);
}

public class LambdaTests {
    public static void main(String[] args) {

       MyLambda lambdaFunction = () -> System.out.println("Hello World!");
       MyAdd addFunction = (a, b) ->  a + b;
       
       LambdaTests.AddNumbers(addFunction);
       
    }
    
    public static int AddNumbers (MyAdd addition, int a, int b) {
    	return addition.sum(a, b);
    }
}