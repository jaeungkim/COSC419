package Assignment3.Q1;

/*
 * Because the interface between Line and Rectangle objects is incompatible, 
 * 		the user has to recover the type of each shape and 
 * 			manually supply the correct arguments. 
 * 
 */

//JAE UNG KIM
// make an shape interface first
interface Shape{
    public void draw(int a, int b, int c, int d);
}

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}

class adapterForLine implements Shape{
    private Line line;
    public adapterForLine(Line l){
        this.line = l;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2){
        line.draw(x1, y1, x2, y2);
    }
}

class adapterForRectangle implements Shape{
    private Rectangle rectangle;
    public adapterForRectangle(Rectangle r){
        this.rectangle = r;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2){
        int x = Math.min(x1,x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        rectangle.draw(x,y,width,height);
    }
}
public class NoAdapterProvided {
	public static void main(String[] args) {
        Shape[] shapes = {new adapterForLine(new Line()), new adapterForRectangle(new Rectangle())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
            for (Shape shape : shapes){
                shape.draw(x1, y1, x2, y2);
            }
        }
    }


