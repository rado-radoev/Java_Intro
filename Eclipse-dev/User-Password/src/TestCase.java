import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestCase {
	public static HashMap<User, Password> userMap = new HashMap<User, Password>();

	public static void main(String[] args) throws AccessDeniedException {

		// Instantiating default password to use
		Password pass = new Password();

		// Instantiating user objects
		User user = new User("Bob", "user");
		User user2 = new User("Jim", "user");
		User user3 = new User("Liz", "super user");

		// Adding users to map
		userMap.put(user, pass);
		userMap.put(user2, new Password("SuperMegaPassw0rd"));
		userMap.put(user3, new Password("JavaIsTheBest1"));

		// Ask the user for username and password and verifies if they are correct
		while (true) {
			System.out.println("Enter user name:");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();

			// Output username and password to Array
			String[] userPass = FindUserAndPassword(input);

			// Verify if the username is in the array on position 0.
			// If not ask again, else fall through
			if (!VerifyUserExists(userPass)) {
				System.out.println("User does not exist.\n");
				continue;
			}

			// Test if the password is correct.
			// If password match output to screen and exit
			// Else throw an exception and display Access Denied message.
			try  {
				System.out.println("Enter password:");
				input = scanner.next();
				if (VerifyPassword(userPass, input)) {
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

	/**
	 * Check if the user specified exists in the HashMap
	 * @param input		input as Array. username is string and is first element in Array
	 * @return			true if user exists. false if user does not exist.
	 */
	public static boolean VerifyUserExists(String[] input)  {
		if (input[0] == null) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * Verifies if the user password is correct
	 * @param input		input as Array. Password is string and is second element in Array.
	 * @param pass		password as String. Entered by user.
	 * @return			true if passwords match
	 * @throws AccessDeniedException	if passwords do not match an exception is thrown.
	 */
	public static boolean VerifyPassword(String[] input, String pass) throws AccessDeniedException {
		if (input[1].equals(pass)) {
			return true;
		}
		else {
			throw new AccessDeniedException(null);
		}
	}


	/**
	 * Method to check if user exists in the HashMap
	 * @param user		username as String from user input
	 * @return			array of username and password as string
	 */
	public static String[] FindUserAndPassword(String user) {
		String[] userAndPass = new String[2];

		// Iterate through the map using Entry Set
		Iterator<Entry<User, Password>> entrySetIterator = userMap.entrySet().iterator();

		while (entrySetIterator.hasNext()) {
			Entry entry = entrySetIterator.next();

			// Type casting needed for the User and Password objects
			User u = (User)entry.getKey();
			Password p = (Password)entry.getValue();

			if (user.toLowerCase().equals(u.getUsername().toLowerCase())) {
				userAndPass[0] = u.getUsername();
				userAndPass[1] = p.getPassword();
			}
		}
		return userAndPass;
	}
}
