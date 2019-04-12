package abhinav;
import java.math.BigInteger; 

import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class PasswordHash {
	
	private static String password;
	private String userID;
	
	public PasswordHash(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}
	
	public static String getSHA() 
	{ 

		try { 
			
			// CHANGE THIS

			// Static getInstance method is called with hashing SHA 
			MessageDigest pwd = MessageDigest.getInstance("SHA-256"); 

			// digest() method called 
			// to calculate message digest of an input 
			// and return array of byte 
			byte[] hashPass = pwd.digest(password.getBytes()); 

			// Convert byte array into signum representation 
			BigInteger no = new BigInteger(1, hashPass); 

			// Convert message digest into hex value 
			String hashPassword = no.toString(16); 

			while (hashPassword.length() < 32) { 
				hashPassword = "0" + hashPassword; 
			} 

			return hashPassword; 
		} 

		// For specifying wrong message digest algorithms 
		catch (NoSuchAlgorithmException e) { 
			System.out.println("Exception thrown"
							+ " for incorrect algorithm: " + e); 

			return null; 
		} 
	}
}
