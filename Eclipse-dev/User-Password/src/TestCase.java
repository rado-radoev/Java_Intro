
public class TestCase {

	public static void main(String[] args) {
		Password pass = new Password("fuckingPassword");
		System.out.println();
		
		Users user = new Users("Petko", "Manager", "Huiovina2");
		System.out.println("The username is: " + user.getUsername() + ". " +
				"The role is: " + user.getRole() + ". " + 
				"The password is: " + user.getPassword());
		
		Users user2 = new Users("Vladko", "Po-golemo Shefche", "BashHui@2");
		System.out.println("The username is: " + user2.getUsername() + ". " +
				"The role is: " + user2.getRole() + ". " + 
				"The password is: " + user2.getPassword());

	}

}
