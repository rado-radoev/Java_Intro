
public class Users extends Password {

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
	
	public String getRole() {
		return this.role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	

	
	public static void main(String[] args) {
		Password pass = new Password();
		System.out.println(pass.getPassword());
	}
}
