/*
 * Modified From AvaJava.com http://www.avajava.com/tutorials/lessons/facade-pattern.html?page=2
 * 
The facade pattern is a structural design pattern. 
	In the facade pattern, a facade classes is used to provide a single interface to set of classes. 
	The facade simplifies a clients interaction with a complex system by localizing 
		the interactions into a single interface.
	As a result, the client can interact with a single object rather than being required
 	to interact directly in complicated ways with the objects that make up the subsystem.

	As an example, supposed we have three horribly written classes. 
		For based on the class and method names (and the lack of documentation), 
		it would be very difficult for a client to interact with these classes.

	C1's doSomethingComplicated() method takes an integer and returns its cube.
	C2's doAnotherThing() method doubles the cube of an integer and returns it.
	C3's doMoreStuff() takes a C1 object, a C2 object, and an integer and
		returns twice the sixth power of the integer.

	For a client unfamiliar with C1, C2, and C3,
 		it would be very difficult to figure out how to interact with these classes. 
 		The classes interact and perform tasks in unclear ways. 
 
 	As a result, we need to be able to simplify interaction with this system of classes
  so that clients can interact with these classes in a simple, standardized manner.

 * 
 */


package Class_Examples.FacadeMath;

public class FacadeDemo1 {
	public static void main(String[] args) {

		Facade facade = new Facade();
		int x = 10;
		System.out.println("Cube of " + x + " = " + facade.cubeX(x));
		System.out.println("Cube of " + x + " times 2 = " + facade.cubeXTimes2(x));
		System.out.println(x + " to 6th power times 2 = " + facade.xToSixthPowerTimes2(x));

	}
}
