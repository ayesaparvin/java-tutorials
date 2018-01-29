package PolymorphismDemo;

public class PolymorphismDemo {

	public static void main(String[] args)
	{
		Animal animal = new Animal();
		
		animal.toString();
		animal.hashCode();
		
		animal.eat();
		animal.sleep();
		
		Dog dog = new Dog();
		
		dog.toString();
		dog.hashCode();
		
		dog.eat();
		dog.sleep();
		dog.DogSpecificBehaviour();
		
		Animal dog1 = new Dog();
		
		dog1.toString();
		dog1.hashCode();
		
		dog1.eat();
		dog1.sleep();
		
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Cat();
		
		a.eat();
		b.eat();
		c.eat();
		
//		Example 2
		
		Animal animals[] = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
				
		for (int i = 0; i < animals.length; i++) {
			Animal animall = animals[i]; System.out.println("array1");
			animall.eat();
		}
		
		public static void executeEatBehaviour(Animal animallll) {
			System.out.println();
		}
		
		
		
	}
}
