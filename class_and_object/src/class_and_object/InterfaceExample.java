/**
 * 
 */
package class_and_object;

/**
 * 
 */
//Homework
//Interface: Flyable, Swimmable
//class: bird,让它实现这两个interface

interface Vehicle{
	void start();
	
	void stop();
	
	default void honk() {//java8以后表示其是interface的默认函数
		System.out.println("Vehicle is honking!");
	}
}

interface Machine extends Vehicle{
	void material();
	
}
class Car implements Vehicle{
	@Override
	public void start(){
		System.out.println("Car is starting!");
	}
	public void stop() {
		System.out.println("Car is stopping!");
	}
	
	
}

public class InterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.honk();

	}

}
