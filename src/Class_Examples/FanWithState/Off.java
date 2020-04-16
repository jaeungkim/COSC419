package Class_Examples.FanWithState;

public class Off implements State
{
    public void pull(CeilingFanPullChain wrapperState)
    {
    	wrapperState.set_state(new Low());
        System.out.print("  - low speed");
        System.out.println("   turn the led lights to yellow");
        
}
    public String toString() {
    	return " off state ";
		
	}

}
