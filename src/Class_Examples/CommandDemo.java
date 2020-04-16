package Class_Examples;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	public static List produceRequests() {
        List<Command> list = new ArrayList<>();
        list.add(new DomesticEngineer());
        list.add(new Politician());
        list.add(new Programmer());
        return list;
    }

    public static void workOffRequests(List<Command> list) {
        for (Command c1 : list) {
            c1.execute();
        }
    }

    public static void main( String[] args ) {
        List list = produceRequests();
        workOffRequests(list);
    }

}
