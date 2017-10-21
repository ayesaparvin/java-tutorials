
public class bool {
	public static void main(String Args[]) {
		boolean b;
		b = false;
		System.out.println("b is "+ b);
		
		b= true;
		System.out.println("b is "+ b);
		
		if (b) System.out.println("this is executing!");
		
		b = false;
		if (b) System.out.println("this is not going to execute.");
		
		System.out.print("10>9 is " + (10>9)); //The outcome of a relational operator, such as <, is a boolean value.
	}
}
