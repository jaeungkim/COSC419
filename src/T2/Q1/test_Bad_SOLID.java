package T2.Q1;


//JAE UNG KIM - Q1
//interface for separate work();

interface work{
	public void work();
}

//interface for separate eat();
interface eat{
	public void eat();
}

interface IWorker extends work, eat{
}

class Worker implements work, eat{
	public void work() {
		System.out.println(" Average worker works kind-of ");
	}
	public void eat() {
		System.out.println("     eats fast food frequently ");
	}
}
class SuperWorker implements work, eat{
	public void work() {
		System.out.println(" Super worker works efficiently");
	}
	public void eat() {
		System.out.println("     eats healthy food generally ");
	}
}

//Robot doesn't eat = don't implement Ieat
class Robot implements work {
	public void work() {
		System.out.println(" Robot works very fast without mistake");
	}
}

class Manager {
	work worker;
	public Manager (work w) {
		this.worker = w;
	}
	public void work() {
		System.out.println(" Manager delegates ");
		worker.work();
	}
}
public class test_Bad_SOLID {
	public static void main(String[] args) {
		Worker w = new Worker();
		Robot  r = new Robot();
		SuperWorker s = new SuperWorker();
		Manager m = new Manager(s);
		w.work();
		w.eat();
		r.work();
// 		r.eat();   // uncomment this line and run the program again
		s.work();
		s.eat();
	}
}

