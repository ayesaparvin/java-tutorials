package inheritanceDemo;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person person ;
		person = new Person("First", "Last");
		person = null;
		
		method1(person);

	}
  
	static void method1(Person person)
	{
		person.firstName = "ABC";
	}
}
