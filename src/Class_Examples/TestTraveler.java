package Class_Examples;

interface Vehicle {
    public void move();

    public String type();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println(" I am gasoline monster");
    }

    public String type() {
        return " a Car type ";
    }
}


class Traveler {
    private Vehicle v;

    public Traveler(Vehicle x) {
        this.v = x;
    }

    public Vehicle getV() {
        return v;
    }

    public void startJourney() {
        v.move();
        System.out.println(v.type());
    }

    public String toString() {
        return " Traveller is using"
                + v.type();
    }

}

class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println(" I am a healthy rider ");
    }

    public String type() {
        return "  a Bike type ";
    }
}

public class TestTraveler {

    public static void main(String[] args) {

        Traveler traveler = new Traveler(new Car()); // Inject Car dependency
        traveler.startJourney(); // start journey by Car
        System.out.println(traveler);

        traveler = new Traveler(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike

        System.out.println(traveler);

    }
}
