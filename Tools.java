/*THOUGH "super" keyword is not mandatory, I am just being explicit. 
HOWEVER I am not using "super" keyword for variable "id" be it is a static variable. Static variable are common to all instances.
*/

/* I have made the variables as protected, however for correct implementation, we should put all class hierarchies 
in different packages (make all classes public) and all subclasses in different classes but in same package.
*/ 

public class Tools {
	protected static int id;
	protected int myid;
	protected String type; 
	protected int toolRentalAmount;
	
//	public int intgetToolId() {
//		return id;		
//	}
	
	public String getToolType() {
		return type;
	}
	
	public int getToolRentalAmount() {
		return toolRentalAmount;		
	}
	
}

class Painting extends Tools {
	public Painting() {
		id = id +1;
		super.myid=id;
		super.type = "Painting";
		super.toolRentalAmount = 3;		
	}
}

class Plumbing extends Tools {
	public Plumbing() {
		id = id +1;
		super.myid=id;
		super.type = "Plumbing";
		super.toolRentalAmount = 4;
	}
}

class Concrete extends Tools {
	public Concrete() {
		id = id +1;
		super.myid=id;
		super.type = "Concrete";
		super.toolRentalAmount = 5;
	}
}

class Yardwork extends Tools {
	public Yardwork() {
		id = id +1;
		super.myid=id;
		super.type = "Yardwork";
		super.toolRentalAmount = 7;
	}
}

class Woodwork extends Tools {
	public Woodwork() {
		id = id +1;
		super.myid=id;
		super.type = "Woodwork";
		super.toolRentalAmount = 10;
	}
}