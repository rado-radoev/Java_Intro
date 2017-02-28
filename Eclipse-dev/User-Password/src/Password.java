
public class Password {

	/**
	 * Setting empty password field.
	 */
    //private String password = "Welcome1";
    private String password = null;

    /**
     * Default Password constructor
     * Default password for newly Created user is Welcome1
     */
    public Password() {
    	setPassword("Welcome1");
    }

    /**
     * Setting password.
     * @param password	Password as string
     */
    public Password (String password) {
        setPassword(password);
    }

    /**
     * Password setter. Sets password if complexity checks are met.
     * @param password	Password as string
     */
    private void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    /**
     * Password getter.
     * @return	User password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Breaks password string to character array
     * @param password 	Password as string
     * @return	Array of characters
     */
    private char[] PasswordToChar(String password) {
        return password.toCharArray();
    }

    /**
     * Checks if password is valid, meeting all password complexity
     * @return boolean true or false
     */
    private boolean isPasswordValid(String pass) {
        if (isPasswordLenght(pass) && hasPasswordNumber(pass) &&
        hasPasswordCapital(pass)) {
            return true;
        }
        return false;
    }

    /**
     * Checks password length
     * @param pass	Password as string
     * @return boolean true or false
     */
    private boolean isPasswordLenght(String pass) {
    	if (pass.length() >= 8) {
    		return true;
    	}
    	return false;
    }

    /**
     * Checks if password has a Number
     * @param pass	Password as string
     * @return	boolean true or false
     */
    private boolean hasPasswordNumber(String pass) {
        for (Character c : PasswordToChar(pass)) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks password has a Capital letter
     * @param pass	Password as string
     * @return	boolean true or false
     */
    private boolean hasPasswordCapital(String pass) {
        for (Character c : PasswordToChar(pass)) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

}
