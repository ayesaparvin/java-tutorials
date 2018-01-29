package PolymorphismDemo;

public class Dog extends Animal{
	public void eat() 
	{
		System.out.println("Dog way of eating food.");
	}
	
	public void sleep() 
	{
		System.out.println("Dog way to sleep.");
	}
	
	public void DogSpecificBehaviour() 
	{
		System.out.println("DogSpecificBehaviour");
	}
	
}
