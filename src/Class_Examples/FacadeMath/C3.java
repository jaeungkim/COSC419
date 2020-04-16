package Class_Examples.FacadeMath;

public class C3 {
	public int doMoreStuff(C1 c1, C2 c2, int x) {
		return c1.doTheMath(x) * c2.doAnotherThing(c1, x);
	}
}
