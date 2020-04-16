package T2.Q4;
//JAE UNG KIM T2
interface Color {
    public void paintColor();
}

class RedColor implements Color {
   public void paintColor(){
       System.out.println("color red.");
   }
}

class GreenColor implements Color {
    public void paintColor(){
        System.out.println("color green.");
    }
}

abstract class Shape implements Color {
    public Color color;
    public Shape(Color c){
        this.color = c;
    }
    abstract public void paintColor();
}
class Triangle extends Shape {

   public Triangle(Color c){
       super(c);
   }
   @Override
    public void paintColor(){
       System.out.print("Paint Triangle with ");
       color.paintColor();
   }
}

class Circle extends Shape {
    public Circle(Color c){
        super(c);
    }
    @Override
    public void paintColor(){
        System.out.print("Paint Circle with ");
        color.paintColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        Shape s1 = new Triangle(new RedColor());
        Shape s2 = new Triangle(new GreenColor());
        s1.paintColor();
        s2.paintColor();

        Shape s3 = new Circle(new RedColor());
        Shape s4= new Circle(new GreenColor());
        s3.paintColor();
        s4.paintColor();
    }
}




