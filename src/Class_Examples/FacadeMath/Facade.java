package Class_Examples.FacadeMath;

public class Facade {
	public int cubeX(int x) {
		C1 c1 = new C1();
		return c1.doTheMath(x);
	}
	public int cubeXTimes2(int x) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		return c2.doAnotherThing(c1, x);
	}

	public int xToSixthPowerTimes2(int x) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		return c3.doMoreStuff(c1, c2, x);
	}
}
