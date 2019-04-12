package abhinav;

public class LoginValidation {
	private String userID;
	private String password;
	
	public LoginValidation(String name, String pswd) {
		this.userID = name;
		this.password = pswd;
	}

	public boolean userValidation() {
		if (1==1) {
			// FIrst we will check if username exists in the database, if yes, then check for password hash if it matches.
			PasswordHash passwordHash = new PasswordHash(userID, password);
			passwordHash.getSHA();
			//if((pwdDb.containsKey(userName)) && (password.equals(pwdDb.get(userName))))
			System.out.println("Login Successful");
			return true;
		}
		else {
			System.out.println("Sign-up successful");
			// Add user to the db.
			return false;
		}
	}
}
