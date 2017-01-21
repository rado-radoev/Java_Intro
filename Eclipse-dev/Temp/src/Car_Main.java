
public class Car_Main {

		public static void main(String[] args) {
			Car ford = new Car();
			
			/* Field that has default value and has not been
			 * initialized in the constructor can lead to errors in the program
			 */
			System.out.println(ford.color);	
			
			/*
			 * The value of the field has to be specifically called
			 * and modified. 
			 */
			ford.color = "White";
			System.out.println(ford.color);
		}
}
