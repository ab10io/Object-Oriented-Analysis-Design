import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Shop {
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

	public static Customer[] getRandom(Customer[] clist, int n) {
		Customer[] temp= new Customer[n];
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1, 2, 3, 4, 5, 6,7,8,9));
		Collections.shuffle(arr);
		for(int j=0; j<n; j++ ) {
			temp[j]=clist[arr.get(j)];
		}
		return temp;
		}
	
	public static void main(String[] args) {
		//Generate 10 random Customer
		String[] cNames = new String[]{"Divya", "Abhinav", "Sravanth","Sowmya",
				"Tom","Bruce","John","Liza","Lee","Xua"};
		
		Customer[] Cust= GenerateCust(cNames);
		Tools[] tools=GenerateTools();
		 //for(int i=0;i<35;i++) {
			 int n = (int)(Math.random() * 7 + 1);
			 System.out.println(n);
			Customer[] cSubset=getRandom(Cust,n);
			System.out.println(cSubset.length);
			for(int k=0; k<cSubset.length; k++) {
				System.out.println(cSubset[k].nameOfCustomer);
								
			}
			System.out.println(cSubset.length);
			 
		 //}

}
}