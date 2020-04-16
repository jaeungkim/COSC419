package Class_Examples.FanWithState;

public class CeilingFanPullChain {
	private State m_current_state; // reference to current state 
	
    public CeilingFanPullChain()   {
        m_current_state = new Off();
    }
    public void set_state(State s) {   	
        m_current_state = s;
    }
    public void pull() {
    	m_current_state.pull(this);
    	System.out.println(" done pull" + this.toString());
    }
    public String toString() {
    	return m_current_state.toString();
		
	}
}
