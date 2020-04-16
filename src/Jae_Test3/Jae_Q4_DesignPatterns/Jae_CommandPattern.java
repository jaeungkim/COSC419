package Jae_Test3.Jae_Q4_DesignPatterns;

import java.util.ArrayList;
import java.util.List;

interface Command{
    void execute();
}

class flyStyleStroke implements Command {
    public void execute(){
        System.out.println("Fly is the starting stroke");
        System.out.println(" You should be doing Fly otherwise you will be DQ");
        System.out.println(" Your next stroke is back");
        System.out.println(" Be sure to swim on your back after the wall");
    }
}

class backStyleStroke implements Command {
    public void execute(){
        System.out.println("Back is the 2nd stroke");
        System.out.println(" Swim on your back otherwise you will be DQ");
        System.out.println(" Your next stroke is breast");
        System.out.println(" Be sure to swim on your front after the wall");
    }
}

class breastStyleStroke implements Command {
    public void execute(){
        System.out.println("Breast is the 3rd stroke");
        System.out.println(" Swim on your front for breast stroke otherwise you will be DQ");
        System.out.println(" Your next stroke is free style");
        System.out.println(" Be sure to touch the wall with both hands evenly.");
        System.out.println(" Swim in free style after the wall");
    }
}

class freeStyleStroke implements Command {
    public void execute(){
        System.out.println("Free is the 4th and last stroke");
        System.out.println(" Swim in your fastest stroke which is mostly free style");
        System.out.println(" This is the last stroke");
        System.out.println(" You will have to wait for everyone to finish after you touch the wall.");
    }
}

class Jae_CommandPattern{
    public static List produceRequests(){
        List<Command> list = new ArrayList<>();
        list.add(new flyStyleStroke());
        list.add(new backStyleStroke());
        list.add(new breastStyleStroke());
        list.add(new freeStyleStroke());
        return list;
    }

    public static void workOffRequests(List<Command> list){
        for (Command c1 : list) {
            c1.execute();
        }
    }

    public static void main(String[] args){
        List list = produceRequests();
        workOffRequests(list);
    }
}



