package Class_Examples.FanWithState;

public class Medium implements State {
    public void pull(CeilingFanPullChain wrapperState) {
    	wrapperState.set_state(new High());
        System.out.print("  - high speed");
        System.out.println("   turn the led lights to purple...!");
    }
    public String toString() {
    	return " medium state ";
		
	}
}
