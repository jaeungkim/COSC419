package Class_Examples.FanWithState;

public class High implements State{
    public void pull(CeilingFanPullChain wrapperState) {
        wrapperState.set_state(new Off());
        System.out.print("  - turning off");
        System.out.println("   turn the led lights to black ");
    }
    public String toString() {
    	return " high state ";
		
	}
}
