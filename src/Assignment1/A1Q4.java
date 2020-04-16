package Assignment1;

interface Students {
    public void study();

    public void party();

    public void sleep();
}

class Grad implements Students {
    private String name = "Grad";

    public void study() {
        System.out.println("Grad students do research");
    }

    public void party() {
        System.out.println("Grad parties sometime");
    }

    public void sleep() {
        System.out.println("Grad students don't sleep that much");
    }

    public String toString() {
        return name;
    }
}

class PartTime implements Students {
    private String name = "PartTime";

    public void study() {
        System.out.println("PartTime students make $$ and study");
    }

    public void party() {
        System.out.println("PartTime students party at work");
    }

    public void sleep() {
        System.out.println("PartTime students sleep at work");
    }

    public String toString() {
        return name;
    }
}

class UnderGrad implements Students {
    private String name = "UnderGrad";

    public void study() {
        System.out.println("UnderGrad studies sometime");
    }

    public void party() {
        System.out.println("UnderGrad tends to party hard");
    }

    public void sleep() {
        System.out.println("UnderGrad tends to sleep a lot");
    }

    public String toString() {
        return name;
    }
}

public class A1Q4 {
    public static void main(String[] args) {
//        store types of students in an array: Grad, UnderGrad, PartTime
        Students[] studentTypes = {new Grad(), new UnderGrad(), new PartTime()};
//            Print study / party / sleep values of student types
        for (Students std : studentTypes) {
            System.out.println(std.toString() + ":");
            std.study();
            std.party();
            std.sleep();
        }
    }
}