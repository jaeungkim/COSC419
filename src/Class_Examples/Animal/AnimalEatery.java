package Class_Examples.Animal;
// Create a facad class to capture the components and delegate it to eatxyz( ) method to represent
// each animal
public class AnimalEatery {
	private Animal dog;
	private Animal cat;
	private Animal shark;
	   public AnimalEatery() {
		   dog = new Dog();
		   cat = new Cat();
		   shark = new Shark();
		 }
	   public void eatDog(){
	      dog.eat();
	   }   
	   public void eatCat(){
		      cat.eat();
		   }
	   public void eatShark(){
		      shark.eat();
		   }
	    }

