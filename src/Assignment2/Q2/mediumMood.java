package Assignment2.Q2;

public class mediumMood extends Mood {

    public mediumMood(String condition, int grade) {
        super(condition, grade);
        System.out.println("I am in a strange medium mood");
    }

    private void goodGrade() {
        System.out.println("\tOK...Well done, Go enjoy your party and B.Good");
    }
    private void mediumGrade() { System.out.println("\tOK...Well done, Go enjoy your party and B.Good"); }
    private void lowGrade() { System.out.println("\tyou failed. you are staying home."); }
    private void veryLowGrade() { System.out.println("\tyou failed. you are staying home."); }

    //call duties for doctors
    public void decision() {
        goodGrade();
    }
    public void decision2() {
        mediumGrade();
    }
    public void decision3() {
        lowGrade();
    }
    public void decision4() {
        veryLowGrade();
    }



}


