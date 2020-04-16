package T2.Q2_Q3;

import java.util.ArrayList;

//JAE UNG KIM - Q2/Q3
interface Greetings {
    public String greet();
}

class CasualGreetings implements Greetings {
    public String greet() {
        return "Sup bro?";
    }
}
class FormalGreetings implements Greetings {
    public String greet() {
        return "Good evening, sir (or Ma'am).";
    }
}
class CloseGreetings implements Greetings {
    public String greet() {
        return "Hello Dear!";
    }
}

//Rude Greetings Class
class RudeGreetings implements Greetings {
     public String greet() { return "What do you want!?"; }
}


 public class Greeter {
     public static void main(String[] args) {
        ArrayList<String> greetingArray = new ArrayList<>();
        greetingArray.add(new CasualGreetings().greet());
        greetingArray.add(new FormalGreetings().greet());
        greetingArray.add(new CloseGreetings().greet());
        //RUDE GREETINGS FOR NEXT QUESTION
        greetingArray.add(new RudeGreetings().greet());
        greetingArray.add("Hello.");
         for(int i = 0; i < greetingArray.size(); i++) {
             System.out.println(greetingArray.get(i));
         }
     }
 }



