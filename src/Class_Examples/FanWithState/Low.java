package Class_Examples.FanWithState;

public class Low implements State {
    public void pull(CeilingFanPullChain wrapperState)  {
    	wrapperState.set_state(new Medium());
        System.out.print("  - medium speed");
        System.out.println("   turn the led lights to orange");
    }
    public String toString() {
    	return " low state";
		
	}
}
