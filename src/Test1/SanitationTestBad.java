package Test1;

class Sanitation {
    // JAE UNG KIM - 37007135 Question 1
    public String WashHands() {
        return "Adult tends to Wash hand with soap.";
    }
}

//Child class that references Sanitation
class Child{
    private Sanitation san;
    public Child(Sanitation san1){this.san=san1;} //reference
    public String WashHands() {
        return "Kids tends to Wash hand with a quick rinse";
    }
}

public class SanitationTestBad {
    public static void main(String[] args) {
        Sanitation s1 = new Sanitation();
//      Child c1 = new Child();
        System.out.println(s1.WashHands());
        Child c1 = new Child(new Sanitation()); // call child c1 that references sanitation()
        System.out.println(c1.WashHands());
    }
}
