package oopsPre;

public class Animal {
	class Pet{
		class Dog
		{
			void walk()
			{
				System.out.println("Dog Is Walking");
			}
			void sleep()
			{
				System.out.println("Dog Is Sleeping");
			}
		}
		class Cat
		{
			void walk()
			{
				System.out.println("Cat Is Walking");
			}
			void sleep()
			{
				System.out.println("Cat Is Sleeping");
			}
		}
	}
		class WildAnimals
		{
			class Tiger
			{
				void walk()
				{
					System.out.println("Tiger Is Walking");
				}
				void hunt()
				{
					System.out.println("Tiger is hunting");
				}
			}
		}
	public static void main(String[] args) {
		Animal.Pet.Dog d = new Animal().new Pet().new Dog();
		d.walk();
		d.sleep();
		Animal.Pet.Cat c = new Animal().new Pet().new Cat();
		c.walk();
		c.sleep();
		Animal.WildAnimals.Tiger t = new Animal().new WildAnimals().new Tiger();
		t.walk();
		t.hunt();
		
		
		
	}

}
