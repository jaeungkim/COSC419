package Jae_Test3.Jae_Q3_ChainOfResponsibility;

//Chain of responsibility Design Pattern - JAE KIM
class Number{
    private int number;
    public Number(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}
interface Chain{
    public abstract void setNext(Chain nextInChain);
    public abstract void process(Number request);
}

class days implements Chain{
    private Chain nextInChain;

    public void setNext(Chain c){
        nextInChain = c;
    }
    public void process(Number request) {
        if (request.getNumber() < 7 && request.getNumber() > 0) {
            System.out.println("This number corresponds to " + request.getNumber() + " days.");
        } else {
            nextInChain.process(request);
        }
    }
}

class weeks implements Chain {
    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Number request) {
        if (request.getNumber() > 7 && request.getNumber() < 31) {
            System.out.println("This number corresponds to " + request.getNumber() / 7 + " weeks.");
        } else {
            nextInChain.process(request);
        }
    }
}
class months implements Chain {
    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Number request) {
        if (request.getNumber() > 31 && request.getNumber() < 365) {
            System.out.println("This number corresponds to " + request.getNumber() / 31 + " months.");
        } else {
            nextInChain.process(request);
        }

    }
}
class years implements Chain {
    private Chain nextInChain;

    public void setNext(Chain c) {
        nextInChain = c;
    }

    public void process(Number request) {
        if (request.getNumber() > 365) {
            System.out.println("This number corresponds to " + request.getNumber() / 365 + " years.");
        } else {
            nextInChain.process(request);
        }
    }
}
public class Q3 {
    public static void main(String[] args){
        //configure chain of responsibility
        Chain c1 = new days();
        Chain c2 = new weeks();
        Chain c3 = new months();
        Chain c4 = new years();
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);

        Number n1 = new Number(3);
        Number n2 = new Number(25);
        Number n3 = new Number(76);
        Number n4 = new Number(234);
        Number n5 = new Number(4050);

        //SAMPLE OUTPUTS THAT CLEARLY INDICATES CHAN OF RESPONSIBILITY
        System.out.print("Number of days = " + n1.getNumber() + " and "); c1.process(n1);
        System.out.print("Number of days = " + n2.getNumber() + " and "); c1.process(n2);
        System.out.print("Number of days = " + n3.getNumber() + " and "); c1.process(n3);
        System.out.print("Number of days = " + n4.getNumber() + " and "); c1.process(n4);
        System.out.print("Number of days = " + n5.getNumber() + " and "); c1.process(n5);

    }
}
