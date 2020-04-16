package Jae_Test3.Jae_Q4_DesignPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface State {
    void pull(swimContextState nextState);
}
class swimContextState{
    private State m_current_state;
    public swimContextState(){m_current_state = new flyStrokeState();}
    public void set_state(State s){m_current_state = s;}
    public void pull(){
        m_current_state.pull(this);
        System.out.println(this.toString());
    }
    public String toString(){
        return m_current_state.toString();
    }
}
class flyStrokeState implements State {

    @Override
    public void pull(swimContextState wrapperState){
        wrapperState.set_state(new backStrokeState());
    }
    public String toString(){
        return "***** Fly ***\n " +
                "   dive off from the starting block\n" +
                "keep shoulders, arms, hips level\n" +
                "breath with your mouth\n" +
                "touch wall with both hand and push off with feet\n";
    }
}

class backStrokeState implements State {

    @Override
    public void pull(swimContextState wrapperState){
        wrapperState.set_state(new breastStrokeState());
    }
    public String toString(){
        return "***** Back *** \n" +
                "   push off from the starting wall in water\n" +
                "swim on your back and rotate your arms\n" +
                "touch wall with both hand and push off with feet\n";
    }
}
class breastStrokeState implements State {

    @Override
    public void pull(swimContextState wrapperState){
        wrapperState.set_state(new freeStrokeState());
    }
    public String toString(){
        return "***** Breast ***\n" +
                "   dive off from the starting block\n" +
                "do the breastStroke\n" +
                "Keep optimal gliding distance\n" +
                "breath with your mouth\n" +
                "do whip kick \n" +
                "touch wall with both hand and push off with feet\n";
    }
}

class freeStrokeState implements State {

    @Override
    public void pull(swimContextState wrapperState){
        wrapperState.set_state(new flyStrokeState());
    }
    public String toString(){
        return "***** free ***\n" +
                "   dive off from the starting block\n" +
                "free for all, pick your fastest one!\n" +
                "do the free style stroke \n" +
                "do vertical kick progression \n" +
                "flip-tumble turn and push off with feet \n";
    }
}

public class Jae_StateDesignPattern {
    public static void main(String[] args) {
        String x;
        swimContextState chain = new swimContextState();
        System.out.println(chain);
        while(true){
            System.out.print("press Enter to view next state press(1) to get out");
            x = get_line();
            if(x.equals("1"))break;

            chain.pull();
        }
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
