import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Support implements ISupport {
	
	public HashMap<User, Password> userMap = new HashMap<User, Password>();
	
	/**
	 * Check if the user specified exists in the HashMap
	 * @param input		input as Array. username is string and is first element in Array
	 * @return			true if user exists. false if user does not exist.
	 */
	@Override
	public boolean VerifyUserExists(String[] input)  {
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
	@Override
	public boolean VerifyPassword(String[] input, String pass) throws AccessDeniedException {
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
	@Override
	public String[] FindUserAndPassword(String user) {
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
