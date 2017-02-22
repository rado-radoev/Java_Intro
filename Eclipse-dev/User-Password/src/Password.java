
public class Password {

	/**
	 * Setting empty password field.
	 */
    private String password;

    /**
     * Default Password constructor
     */
    public Password() {
      this.password = "Welcome1"
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
        if (isPasswordValid()) {
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
    private boolean isPasswordValid() {
        if (isPasswordLenght(password) && hasPasswordNumber(password) &&
        hasPasswordCapital(password)) {
            return true;
        }
        return false;
    }

    /**
     * Checks password length
     * @param password	Password as string
     * @return boolean true or false
     */
    private boolean isPasswordLenght(String password) {
    	if (password.length() >= 8) {
    		return true;
    	}
    	return false;
    }

    /**
     * Checks if password has a Number
     * @param password	Password as string
     * @return	boolean true or false
     */
    private boolean hasPasswordNumber(String password) {
        for (Character c : PasswordToChar(password)) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks password has a Capital letter
     * @param password	Password as string
     * @return	boolean true or false
     */
    private boolean hasPasswordCapital(String password) {
        for (Character c : PasswordToChar(password)) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

}
