
public class Users {

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
	
	
	public String getRole() {
		return this.role;
	}
	
	public void setRole(String role){
		this.role = role;
	}
	
	public String getPassword(){
		return password.getPassword();
	}
}
