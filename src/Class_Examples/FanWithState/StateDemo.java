package Class_Examples.FanWithState;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
    public static void main(String[] args)  {
      	String x;
        CeilingFanPullChain chain = new CeilingFanPullChain();
        System.out.println(chain);
        while (true)   {
            System.out.print("Press Enter Key (entry 1 to quit)");
            x = get_line();
            if (x.equals("1")) break;
            
            chain.pull();
        }
        System.out.println(" done " + chain);
    }
    static String get_line()   {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
        String line = null;
        try {
            line = in.readLine();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}

