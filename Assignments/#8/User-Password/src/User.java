
public class User {

	/**
	 * Setting empty username field.
	 * Setting default password field.
	 * Setting empty role field.
	 */
	private String username;
	private Password password;
	private String role;
	
	/**
	 * User constructor with default password.
	 * @param username		username as String
	 * @param role			role as String
	 * new Password().getPassword() returns the default password from Password Class
	 */
	public User(String username, String role) {
		this(username, role, new Password().getPassword());
	}
	
	/**
	 * User constructor with modified password
	 * @param username	username as String
	 * @param role		role as String
	 * @param pass		password as String
	 */
	public User(String username, String role, String pass) {
		this.password = new Password(pass);
		setUsername(username);
		setRole(role);
	}
	
	/**
	 * Username getter
	 * @return		username as String
	 */
	public String getUsername() {
		return this.username;
	}
	
	/**
	 * Username setter
	 * @param username		username as String
	 */
	public void setUsername(String username){
		this.username = username;
	}

	/**
	 * Role getter
	 * @return		role as String
	 */
	public String getRole() {
		return this.role;
	}
	
	/**
	 * Role setter
	 * @param role		role as String
	 */
	public void setRole(String role){
		this.role = role;
	}
	
	/**
	 * Password getter
	 * @return		User password as String
	 */
	public String getPassword(){
		return password.getPassword();
	}
}
