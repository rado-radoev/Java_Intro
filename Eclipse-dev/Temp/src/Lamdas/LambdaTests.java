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
       MyAdd addFunction = (int a, int b) ->  a + b;
       
//       doubleNumberFunction = (int a) -> a * 2;
//       SafeDivideFunction = (int a, int b) -> b == 0 ? 0 : a /b;
    }
}