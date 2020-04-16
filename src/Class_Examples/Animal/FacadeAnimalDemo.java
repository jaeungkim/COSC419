package Class_Examples.Animal;
//  The client uses (is coupled to) the Facade only
// it uses the methods from the facade class (AnimalEatery) only.

public class FacadeAnimalDemo {

	public static void main(String[] args) {
	 AnimalEatery eatMaker = new AnimalEatery();
	 
	 eatMaker.eatDog();
	 eatMaker.eatCat();
	 eatMaker.eatShark();

	}

}
