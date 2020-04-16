package T2.Q6;

//jae ugn kim
//square peg class - REFERENCE: https://sourcemaking.com/design_patterns/adapter/java/2

//roundHole class
class roundHole {
    private int radius;
    public roundHole(int r){
        this.radius = r;
        System.out.println("RoundHole: max SquarePeg is " + r * Math.sqrt(2));
    }
    public int getRadius(){
        return radius;
    }
}

//squarePeg class
class squarePeg {
    public double width;
    public squarePeg(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}

class SquarePegAdapter{
    squarePeg squarePeg;
    public SquarePegAdapter(double w){
        squarePeg = new squarePeg(w);
    }
    public void size(roundHole roundHole){
        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        System.out.println("Reducing SquarePeg of " + squarePeg.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount");
        if (amount > 0 ){
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            System.out.println(" width is now " + squarePeg.getWidth());
        }
    }
}

public class SquarePegDemo {
    public static void main( String[] args ) {

        //Radius equals 5 for now
        roundHole roundHole = new roundHole(5);
        SquarePegAdapter squarePegAdapter;

        //Looping through
        for (int i = 6; i <= 9; i++) {
            squarePegAdapter = new SquarePegAdapter((double)i);
            squarePegAdapter.size(roundHole);
        }
    }
}