
package Class_Examples.BirdAdapter;

//Java implementation of Adapter pattern 

interface Bird 
{ 
 // birds implement Bird interface that allows 
 // them to fly and make sounds adaptee interface 
 public void fly(); 
 public void makeSound(); 
} 

class Sparrow implements Bird 
{ 
    // a concrete implementation of bird 
    public void fly() 
    { 
        System.out.println("Flying"); 
    } 
    public void makeSound()    { 
        System.out.println("I am a real bird....Chirp Chirp"); 
    } 
} 
//(1 ) client want the bird Sparrow to behave like the toyDuck when squeak() is called.
interface ToyDuck{ 
    // target interface 
    // toyducks dont fly they just make 
    // squeaking sound 
    public void squeak();  // 2. Client want to keep this interface instead of the makeS
} 
  
class PlasticToyDuck implements ToyDuck { 
    public void squeak()
    { 
        System.out.println("I am a Toy Duck.... I Squeak"); 
    } 
} 
// 3.  A "Wapper" class that can "match" the adaptee (Bird) to the client
class BirdAdapter implements ToyDuck 
{ 
    // You need to implement the interface your 
    // client expects to use the squeak(), 
	// the BirdAdapter re-directs the squeak() to markSound() as the Bird
	// 4. get the bird reference so you can call makeSound()
    Bird bird; 
    
    public BirdAdapter(Bird bird)    { 
        // we need reference to the object we 
        // are adapting 
        this.bird = bird; 
    } 
  
    public void squeak()
    { 
        // 5. "mapps" the client interface (squeak() ) to the Adaptee interface (makeSound() ) 
    	// translate the methods appropriately from ToyDuck to bird.makeSound()
        bird.makeSound(); 
    } 
} 

public class BirdExample {
	  public static void main(String args[]) 
	    { 
	        Bird sparrow = new Sparrow(); 
	        ToyDuck toyDuck = new PlasticToyDuck(); 
	  
	        // Wrap a bird in a birdAdapter so that it  
	        // toyDuck makeSound instead of Squeak 
	        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	       
	        System.out.println("Sparrow..."); 
	        sparrow.fly(); 
	        sparrow.makeSound(); 
	  
	        System.out.println("ToyDuck..."); 
	        toyDuck.squeak();  
	  
	        // toy duck behaving like a bird  
	        System.out.println("BirdAdapter use squeak() to make"
	        		+ "Bird call "); 
	        birdAdapter.squeak();  // using the ToyDuck interface squeak()
	    } 
}
