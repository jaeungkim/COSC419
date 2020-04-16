package FanWithNoState;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoStateFan
{
    public static void main(String[] args)
    {
        CeilingFanPullChainX chain = new CeilingFanPullChainX();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            chain.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))  ;
        String line = null;
        try  {
            line = in.readLine();
        }
        catch (IOException ex)  {
            ex.printStackTrace();
        }
        return line;
    }
}
class CeilingFanPullChainX {
    private int m_current_state;

    public CeilingFanPullChainX()  {
        m_current_state = 0;
    }
    public void pull()  {
        if (m_current_state == 0)  {
            m_current_state = 1;
            System.out.print("   - low speed");
            System.out.println("   turn the led lights to yellow");
        }
        else if (m_current_state == 1) {
            m_current_state = 2;
            System.out.print("   - medium speed");
            System.out.println("   turn the led lights to orange");

        }
        else if (m_current_state == 2) {
            m_current_state = 3;
            System.out.print("   - high speed");
            System.out.println("   turn the led lights to purple...!");

        }
        else {
            m_current_state = 0;
            System.out.print("   - turning off");
            System.out.println("   turn off the led lights");

        }
    }
}
