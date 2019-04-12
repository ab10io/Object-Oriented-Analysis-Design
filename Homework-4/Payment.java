package abhinav;

public class Payment {
	private String accountHolderName;
	private int accountHolderNumber;
	private String expiryDate;
	private int CVV;
	private boolean paymentApproved;

	// Getter and Setters.
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountHolderNumber() {
		return accountHolderNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountHolderNumber = accountNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCvv(int CVV) {
		this.CVV = CVV;
	}
//	public boolean isPaymentStatus() {
//		return paymentStatus;
//	}
//	public void setPaymentStatus(boolean paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}
	
	// Get details from the bank file and match the Account Holder name, account number, expiry date and CVV and
	// match it with the bank's database.
	public boolean paymentProcessing() {
//		if {}
//		}
		// Check if the combination of Credit card no, Expiry date and CVV are matching.
		System.out.println("Your payemnt is approved");
		return paymentApproved;
		
	}
}
