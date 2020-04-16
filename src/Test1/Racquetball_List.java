package Test1;

import java.util.LinkedList;
import java.util.List;

public class Racquetball_List {
    //JAE UNG KIM - 37007135 Test 1 - COSC 419L UBCO 2019S
    private List<String> items;

    public Racquetball_List() {
        items = new LinkedList<String>();
    }

    //Add Item to Racketball_List
    public void addItem(String item) {
        items.add(item);
    }

    //Remove Item to Racketball_List
    public void removeItem(String item) {
        items.remove(item);
    }

    public String toString() {
        int index = 1;
        String result = "Racketball items List" + "\n-------------\n";
        for (String item : items) {
            result += String.format("%1d. %s", index++, item) + "\n";
        }
        return result;
    }

}
