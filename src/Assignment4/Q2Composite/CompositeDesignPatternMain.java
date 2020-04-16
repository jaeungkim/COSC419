package Assignment4.Q2Composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Employee emp1 = new Developer("Farhan", 110000);
        Employee emp2 = new Developer("Mansour", 150000);
        Employee emp3 = new Developer("Tafthim", 200001);
        Employee emp4 = new Developer("Hayun", 120000);
        Employee emp5 = new Developer("Carson", 130000);
        Employee emp6 = new Developer("Prajeet", 125005);
        Employee emp7 = new Developer("Nawaf", 123456);


        Employee manager1 = new Manager("Jae", 155000);
        Employee manager2 = new Manager("Jennifer", 160000);

        //people that "Jae" take care of
        manager1.add(emp1); //FARHAN
        manager1.add(emp2); //Mansour
        manager1.add(emp7); //Nawaf

        //people that "Jennifer" take care of
		manager2.add(emp4);
		manager2.add(emp5);
		manager2.add(emp6);

        // Jordan = GM
        Manager generalManager = new Manager("Jordan", 500000);
        generalManager.add(emp3); //Tafthim report to GM , Jordan
        generalManager.add(manager1); //Manager 1 = Jae report to GM, Jordan
		generalManager.add(manager2); //Manager 2 = Jennifer report to GM, Jordan

        System.out.println(" GM print");
        generalManager.print();

    }
}