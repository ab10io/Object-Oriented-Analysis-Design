/*THOUGH "super" keyword is not mandatory, I am just being explicit. 
HOWEVER I am not using "super" keyword for variable "id" be it is a static variable. Static variable are common to all instances.
*/

/* I have made the variables as protected, however for correct implementation, we should put all class hierarchies 
in different packages (make all classes public) and all subclasses in different classes but in same package.
*/ 

public class Customer {
	protected int myid;
	protected String nameOfCustomer;
	protected String typeOfCustomer;
	protected static int id = 0;
	protected int minNumberOfTools;
	protected int maxNumberOfTools;
	protected int minNightsToolRented;
	protected int maxNightsToolRented;
	
	//Getter method - Name of the customer.
	public String getNameOfCustomer() {
		return nameOfCustomer;
	}
	
	// Getter method - Customer ID
	public int getId() {
		return myid;
	}	
	
	// Getter method - Type of Customer
	public String getTypeOfCustomer() {
		return typeOfCustomer;
	}
	
	// Get method - Minimum number of Tools
	public int getMinNumberOfTools() {
		return minNumberOfTools;		
	}
	
	// Get method - Maximum number of Tools
	public int getMaxNumberOfTools() {
		return maxNumberOfTools;		
	}
	
	// Get method - Minimum number of Tools
	public int getMinNightsToolRented() {
		return minNightsToolRented;	
	}
	
	// Get method - Minimum number of Tools
	public int getMaxNightsToolRented() {
		return maxNightsToolRented;		
	}	
	
}


// Regular customer class - Extends class Customer.
class RegularCustomer extends Customer {
	
	// Default constructor modified	
	public RegularCustomer(String name) {
		super.nameOfCustomer = name;
		id=id + 1;
		super.myid=id;
		super.typeOfCustomer = "Regular";
		super.minNumberOfTools = 1;
		super.maxNumberOfTools = 3;
		super.minNightsToolRented = 3;
		super.maxNightsToolRented = 5;
	}
	
}


// Business customer class - Extends class Customer
class BusinessCustomer extends Customer {
	
	// Default constructor modified	
	public BusinessCustomer(String name) {
		super.nameOfCustomer = name;
		id=id + 1;
		super.myid=id;
		super.typeOfCustomer = "Business";
		super.minNumberOfTools = 3;
		super.maxNumberOfTools = 3;
		super.minNightsToolRented = 7;
		super.maxNightsToolRented = 7;
	}
	
}


// Casual customer class - Extends class Customer
class CasualCustomer extends Customer {
	
	// Default constructor modified	
	public CasualCustomer(String name) {
		super.nameOfCustomer = name;
		id=id + 1;
		super.myid=id;
		super.typeOfCustomer = "Casual";
		super.minNumberOfTools = 1;
		super.maxNumberOfTools = 2;
		super.minNightsToolRented = 1;
		super.maxNightsToolRented = 2;
	}	
}
