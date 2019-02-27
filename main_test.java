/*THOUGH "super" keyword is not mandatory, I am just being explicit. 
* HOWEVER I am not using "super" keyword for variable "id" be it is a static variable. Static variable are common to all instances.
*/

/* I have made the variables as protected, however for correct implementation, we should put all class hierarchies 
* in different packages and all subclasses in different classes but in same package.
*/ 
public class main_test {
	static Customer[]  GenerateCust(String[] cNames) {
		Customer[] Cust = new Customer[10];
    	for (int i = 0; i < cNames.length; i++) {
    		int n = (int)(Math.random() * 3 + 1);
    		switch (n) {
    		case 1: Cust[i]= new RegularCustomer(cNames[i]);break;
    		case 2: Cust[i]= new BusinessCustomer(cNames[i]);break;
    		case 3: Cust[i]= new CasualCustomer(cNames[i]);break;
    		}
        }
    	return Cust;
	   }
	
	static Tools[]  GenerateTools() {
	    Tools[] tools = new Tools[20];    	
        for (int i = 0; i < tools.length; i++) {
    		int n = (int)(Math.random() * 5 + 1);
    		switch (n) {
    		case 1: tools[i]= new Painting();break;
    		case 2: tools[i]= new Plumbing();break;
    		case 3: tools[i]= new Yardwork();break;
    		case 4: tools[i]= new Woodwork();break;
    		case 5: tools[i]= new Concrete();break;
    		}
        }
        return tools;
	}

	public static void main(String[] args) {
		//Generate 10 random Customer
		String[] cNames = new String[]{"Divya", "Abhinav", "Sravanth","Sowmya",
				"Tom","Bruce","John","Liza","Lee","Xua"};
		
		Customer[] Cust= GenerateCust(cNames);
		Tools[] tools=GenerateTools();
		
		/* Correct implementation of static variable would be this i.e. we don't need getter method for it. However
		 * I have implemented getter method as well. We can discuss about it. See C2 object getId method use below.
		 */
        for(int j=0; j<10; j++) {
		System.out.println ("ID: " + Cust[j].getId());
		System.out.println ("ID: " + Cust[j].getNameOfCustomer());
		System.out.println ("Min Tools: " + Cust[j].getMinNumberOfTools());
		System.out.println ("Max Tools: " + Cust[j].getMaxNumberOfTools());
		System.out.println ("Min NIghts: " + Cust[j].getMinNightsToolRented());
		System.out.println ("Max Nights: " + Cust[j].getMaxNightsToolRented());
		System.out.println("-----------------------------");
        }		
		System.out.println("**-----------------------TOOL INFORMATION----------------------**");
		/* Correct implementation of static variable would be this i.e. we don't need getter method for it. However
		 * I have implemented getter method as well COMMENTED OUT IN TOOLS CLASS. 
		 * We can discuss about it.
		 */
		for(int j=0; j<20; j++) {
		System.out.println("Tool ID: " + tools[j].myid);
		System.out.println("Tool Type: " + tools[j].getToolType());
		System.out.println("Tool Rental Amount: " + tools[j].getToolRentalAmount());
		System.out.println("--------------------------------------------");
		}
		
		
	}

}
