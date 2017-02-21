import java.util.HashMap;
import java.util.Set;

public class TestCase {

	public static void main(String[] args) {
		Password pass = new Password("fuckingPassword");
		System.out.println();
		
		Users user = new Users("Petko", "Manager", "Huiovina2");
//		System.out.println("The username is: " + user.getUsername() + ". " +
//				"The role is: " + user.getRole() + ". " + 
//				"The password is: " + user.getPassword());
		
		Users user2 = new Users("Vladko", "Po-golemo Shefche", "BashHui@2");
//		System.out.println("The username is: " + user2.getUsername() + ". " +
//				"The role is: " + user2.getRole() + ". " + 
//				"The password is: " + user2.getPassword());
		
		
		HashMap<Users, String> userMap = new HashMap<Users, String>();
		userMap.put(user, user.getPassword());
		userMap.put(user2, user2.getPassword());
		
		Set<Users> userKey = userMap.keySet();
		for (Users u : userKey) {
			System.out.println(u.getUsername() + " " + u.getPassword());
		}

	}

}
