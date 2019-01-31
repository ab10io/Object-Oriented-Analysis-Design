package HW1Q4;
import java.util.Random;

class Shape {
	private int edges;
    void displayShape() {}
    public int getvalue(){return edges;}
    
}

class Circle extends Shape {
	private int edges=0;
	public int getvalue() {return edges;}
    void displayShape() { 	System.out.println("Circle");}
}

class Square extends Shape {
	 private int edges=4;
	 public int getvalue() {return edges;}
     void displayShape() { System.out.println("Square");}
 } 

class Triangle extends Shape {
	 private int edges=3;
	 public int getvalue() {return edges;}
     void displayShape() {System.out.println("Triangle");}
}
 
public class MainClass {    
    public static void main(String[] args) {
    Shape[] s = new Shape[9];
        
    for (int i = 0; i < s.length; i++) {
    	int n = (int)(Math.random() * 3 + 1);
    	switch (n) {
		  case 1: s[i]= new Circle();break;
		  case 2: s[i]= new Square();break;
		  case 3: s[i]= new Triangle();break;
		  }
    }
    System.out.println("\nBefore Sorting");
    System.out.println("#####################");
     for (int i = 0; i < s.length; i++) {s[i].displayShape(); }
   // SORTing
    for (int i=0; i<s.length; i++) {
    	for(int j=0; j<s.length; j++) {
    		if (s[i].getvalue() < s[j].getvalue()){
    			Shape temp= s[i];
    			s[i]= s[j];
    			 s[j]=temp;
    		}
    	 }
    }
    System.out.println("\nAfter Sorting");
    System.out.println("#####################");
    for (int i = 0; i < s.length; i++) {s[i].displayShape();}
  }
   
}
