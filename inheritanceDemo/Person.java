package inheritanceDemo;

public class Person extends java.lang.Object {
	String firstName, lastName;
	char gender;
	int age;
	
	Person(String firstName, String lastName)
	{
		System.out.println("Person class default constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
