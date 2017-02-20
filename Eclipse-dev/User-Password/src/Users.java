
public class Users extends Password {

<<<<<<< HEAD
	/**
	 * Setting empty username field.
	 * Setting default password field.
	 */
	private String username;
	private Password password;
	private String role;
	
	public Users(String username, String role, String pass) {
		password = new Password(pass);
		setUsername(username);
		setRole(role);
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	
=======
	private String userName;
	private String role;
	private Password pass1;
	
	public Users (String userName, String role, String password) {
		super();
		setUserName(userName);
		setRole(role);
		pass1.setPassword(password);
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
>>>>>>> 66b4e1d17dfeca3dbc00c3f998ee541ddd9d01b2
	public String getRole() {
		return this.role;
	}
	
<<<<<<< HEAD
	public void setRole(String role){
		this.role = role;
	}
	
	public String getPassword(){
		return password.getPassword();
=======
	public void setRole(String role) {
		this.role = role;
	}
	

	
	public static void main(String[] args) {
		Password pass = new Password();
		System.out.println(pass.getPassword());
>>>>>>> 66b4e1d17dfeca3dbc00c3f998ee541ddd9d01b2
	}
}
