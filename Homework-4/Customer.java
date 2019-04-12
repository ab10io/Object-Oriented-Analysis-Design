package abhinav;
import abhinav.Payment;
import abhinav.Rating;

public class Customer {
	private String customerName;
	private String customerID;
	private String customerPassword;
	
//	Payment payment;
//	Rating rating;	
//	
//	public Customer(Payment payment, Rating rating) {
//		this.payment = payment;
//		this.rating = rating;
//	}
//	
	// Getters and Setters.
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	// Delegation to the Login class.
	public void delegationToLogin() {
		LoginValidation login = new LoginValidation(getCustomerID(),getCustomerPassword());
		login.userValidation();		
	}
	
	// Delegation to the payment class.
	public void delegationToPayment() {
		Payment payment = new Payment();
		payment.paymentProcessing();		
	}
	
	// Delegation to Rating class.
	public void delegationToRating() {
		Rating rating = new Rating();
		rating.insertCommentToDB();		
	}
	
	
	
}
