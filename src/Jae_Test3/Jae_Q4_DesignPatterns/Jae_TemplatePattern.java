package Jae_Test3.Jae_Q4_DesignPatterns;

abstract class swimTypes{
    final void swim(){
        sleepWell();
        prepareGear();
        foodInTake();
        raceStart();
        technique();
        raceEnd();
    }
    abstract void raceStart();
    abstract void technique();
    void sleepWell(){
        System.out.println("Preparation: well rest with 8 hours sleep last night");
    }
    void prepareGear(){
        System.out.println("Preparation: before the race check: goggle, team swim cap and suite");
    }
    void foodInTake(){
        System.out.println("Preparation: ate light food 2 hours before the race");
    }
    void raceEnd(){
        System.out.println("Race: when finished wait for everyone to finish before leaving ");
    }
}

class freeStyle extends swimTypes{
    public void raceStart(){
        System.out.println("Race: start: dive in from the starting block");
    }
    public void technique(){
        System.out.println("Race: do free style stroke and do a flip turn to reverse");
    }
}
class backStroke extends swimTypes{
    public void raceStart(){
        System.out.println("Race: start: push off from the starting block wall");
    }
    public void technique(){
        System.out.println("Race: do backstroke style and hand touch the wall before turn to reverse");
    }
}

public class Jae_TemplatePattern {
    // 3 (b) - COSC 419L Final T3
    public static void main(String[] args) {
        //Free Style Race
        System.out.println("Doing the free style race...");
        freeStyle freeStyle = new freeStyle();
        freeStyle.swim();

        System.out.println();

        System.out.println("Doing the backstroke race...");
        backStroke backStroke = new backStroke();
        backStroke.swim();
    }
}
