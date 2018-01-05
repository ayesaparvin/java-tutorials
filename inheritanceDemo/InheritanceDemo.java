package inheritanceDemo;

public class InheritanceDemo extends Object{

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
//		b.getx();//!!!!surprised!! I thought any sub class object can't access any super class method.
		int abc = b.getXFromA(); // abc = 10
		int def = b.getXFromB(); // def = 20
		System.out.println("a.x is " + a.x + " b.x is " + b.x); // a.x = 10, b.x = 20
		System.out.println("abc is " + abc + " def is " + def);
		a.x = 35; 
		b.x = 40;
		abc = b.getXFromA(); // abc = 35
		def = b.getXFromB(); // def = 40
		System.out.println("a.x is " + a.x + " b.x is " + b.x);
		System.out.println("abc is " + abc + " def is " + def); // abc = 35, def = 40
	
	}

}
