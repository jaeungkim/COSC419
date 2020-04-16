package Assignment3.Q2;

//Jae Ung Kim, Really should be similiar to Q1


//Create Shape interface
interface Shape{
    void draw();
}

class Circle implements Shape{ //circle class that implements shape
    @Override
    public void draw(){
        System.out.println("Circle.draw() with a radius of 1.5");
    }
}

class Rectangle implements Shape{ //rectangle class that implements shape
    @Override
    public void draw(){
        System.out.println("Rectangle.draw() (2.1,3.2)");
    }
}

class Square implements Shape{ //square class that implements shape
    @Override
    public void draw(){
        System.out.println("Square.draw()(2.5)");
    }
}

class ShapeMaker{ //facde design pattern for shapemaker
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}

public class TestRun {
    public static void main(String[] args) {
        ShapeMaker ex = new ShapeMaker();
        ex.drawCircle();
        ex.drawRectangle();
        ex.drawSquare();
    }
}
