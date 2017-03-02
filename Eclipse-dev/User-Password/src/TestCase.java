import java.nio.file.AccessDeniedException;
import java.util.Scanner;


public class TestCase extends Support {
	
	public static Support support = new Support();
	
	public static void main(String[] args) throws AccessDeniedException {
		
		CreateUsers();
		LoginPrompt();
	}

	private static void LoginPrompt() {
		// Ask the user for username and password and verifies if they are correct
		while (true) {
			System.out.println("Enter user name:");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();

			// Output username and password to Array
			String[] userPass = support.FindUserAndPassword(input);

			// Verify if the username is in the array on position 0.
			// If not ask again, else fall through
			if (!support.VerifyUserExists(userPass)) {
				System.out.println("User does not exist.\n");
				continue;
			}

			// Test if the password is correct.
			// If password match output to screen and exit
			// Else throw an exception and display Access Denied message.
			try  {
				System.out.println("Enter password:");
				input = scanner.next();
				if (support.VerifyPassword(userPass, input)) {
					System.out.println("Welcome, " + userPass[0] + "!");
				}
				break;
			}
			catch (AccessDeniedException e) {
				System.out.println("Access Denied!");
				break;
			}
		}
	}
	
	private static void CreateUsers() {
		// Adding users to map
		support.userMap.put(new User("Bob", "user"), new Password());
		support.userMap.put(new User("Jim", "user"), new Password("SuperMegaPassw0rd"));
		support.userMap.put(new User("Liz", "super user"), new Password("JavaIsTheBest1"));
	}
	
}
