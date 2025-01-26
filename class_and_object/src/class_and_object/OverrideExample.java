/**
 * 
 */
package class_and_object;

class Animal{
	void makeSound() {
		System.out.println("Make Sound!");
	}
	/**
	 * @param sound: Different animals have different sounds.
	 * @return No return value, just print out.
	 */
	//重载overload
	void makeSound(String sound) {
		System.out.println(sound);
		
	}
	
}
class Dog extends Animal{
	@Override//内部重写
	void makeSound() {
		System.out.println("Dog barks!");
	}
	
}


/**
 * 
 */
public class OverrideExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal();
		Dog dog1 = new Dog();
		animal1.makeSound();
		dog1.makeSound();
		animal1.makeSound("Big!");

	}

}
