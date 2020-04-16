package Test1;

public class Racquetball_Test1 {
    //JAE UNG KIM - 37007135 Test 1 - COSC 419L UBCO 2019S
    public static void main(String[] args) {
        Racquetball_List r = new Racquetball_List();
        //add following items to racketball linked list
        r.addItem("Racket");
        r.addItem("balls");
        r.addItem("goggle");
        r.addItem("gloves");
        r.addItem("court shoes");
        r.addItem("shorts");
        //print the items added
        System.out.println("" + r);

        //remove goggle from the list
        r.removeItem("goggle");
        System.out.println("remove item goggle");

        //print the final results
        System.out.println("" + r);
    }
}