package Assignment1;

public class A1Q2 {
    public static void main(String args[]) {
//        Question #2 - Jae Ung Kim (37007135)

//        What is a Class ?  = "A class is the blueprint from which individual objects are created.
//        - "https://docs.oracle.com/javase/tutorial/java/concepts/class.html" (REFERENCE)

//        What kind of variables can class have?: Class Variables / Instance Variables / Local Variables

//        Brief description of each of the variables:
//          Class variables also known as static variables are declared with the static keyword in a class,
//        but outside a method, constructor or a block.

//          Instance variables are declared in a class,but outside a method. ex) int instanceVariable = 10;

//          Local variables are declared in methods, constructors, or blocks.Local variables are created
//        when the method, constructor or block is entered and the variable will be destroyed once it exits the
//        method, constructor, or block.
//        - "https://www.tutorialspoint.com/What-are-class-variables-instance-variables-and-local-variables-in-Java" (REFERENCE)

        Variables obj = new Variables();
        System.out.println("instance variable = " + obj.instanceVariable);
        System.out.print("local variable from method = ");
        new Variables().LocalVariable();
        System.out.println("Class variable = " + obj.staticVariable);
    }

    public static class Variables {

        //class variable (aka static variable)

        static int staticVariable = 99;
        //Instance variable
        int instanceVariable = 10;

        //Local Variable
        public void LocalVariable() {
            int localV = 80;
            System.out.println(localV);
        }
    }
}
