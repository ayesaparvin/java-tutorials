
public class Scope {

	public static void main(String[] args) {
		int x = 10;		
		if (x == 10) {			
			int y = 5;			
			x= x*y;			
			System.out.println("x & y are " +x+", "+y);		
		}
		//System.out.print("x & y are" +x+y); // invalid as scope of y is finished
		System.out.println("x is " +x); // valid as x is still known here
		
		// Another scope example with for loop and casting	
		int a;
		for (a= 0; a<3; a++) {
			double d = 1.12;
			d = (double)(d*a); //type promotion and cast: int a is promoted to double which is multiplied with double b
			//According to book page 47 
			int b = (int)d; // cast: double d is cast into an integer (conversion of double to int) 
			System.out.println("a, d & b are " +a+", "+d+", "+ b);
		}
		//System.out.println("a, d & b are " +a+", "+d+", "+ b); //invalid as scope of b, d are finished
		System.out.println("the scope of a is still valid and a is " +a); // valid as a is still known here
	}

}
