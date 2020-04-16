package Class_Examples.Animal;
// concrete classes implementing the same interface.
public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog eats dog chow");
	}
}
