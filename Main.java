//Create a base class Animal with a method makeSound(). Create two derived classes Dog and Cat that
//override the makeSound() method. Illustrate runtime polymorphism by creating objects of both derived
//classes and invoking the method.//Base Class Animal

class Animal
{
	public void makeSound()
	{
		System.out.println("Animal");
	}
}

//Derived class Dog which overrides makeSound method
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog");
	}
}

//Derived class Cat which overrides makeSound method
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat");
	}
}

public class Main
{
	public static void main(String[] args) 
	{
     // Creating objects
     Animal d = new Dog();
     Animal c = new Cat();
     
     
     d.makeSound();
     c.makeSound(); 
 }
}
