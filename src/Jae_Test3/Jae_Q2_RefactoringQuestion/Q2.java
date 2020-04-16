package Jae_Test3.Jae_Q2_RefactoringQuestion;

//JAE UNG KIM Test3(Final)_Q2

interface Shape {
	double area();
	double perimeter();
	void print();

}
class circle implements Shape{
	private double radius;

	public circle(double radius){
		this.radius = radius;
	}

	//Area of Circle
	@Override
	public double area(){return Math.PI * radius * radius;}

	//Perimeter of Circle
	@Override
	public double perimeter(){return 2 * Math.PI * radius;}

	@Override
	public void print(){
		System.out.println("Circle area with radius " + radius + " = " + area());
		System.out.println("Cricle perimeter is " + perimeter());
	}
}

class square implements Shape{
	private double side;

	public square(double side){
		this.side = side;
	}

	//Area of square
	@Override
	public double area(){return side * side;}

	//Perimeter of square
	@Override
	public double perimeter(){return side * 4;}

	@Override
	public void print(){
		System.out.println("Square area with length " + side + " = " + area());
		System.out.println("Square perimeter is " + perimeter());
	}
}

class rectangle implements Shape{
	private double width;
	private double height;

	public rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}

	//Area of rectangle
	@Override
	public double area(){return width * height;}

	//Perimeter of square
	@Override
	public double perimeter(){return (width+height) * 2;}

	@Override
	public void print(){
		System.out.println("Rectangle area with (w, h) (" + width + " , " + height + ") = " + area());
		System.out.println("Rectangle perimeter is " + perimeter());
	}
}

public class Q2{
	public static void main(String[] args){
		Shape c1 = new circle(1.0);
		Shape sq1 = new square(3.0);
		Shape r1 = new rectangle(3.0, 4.0);

		c1.print();
		r1.print();
		sq1.print();
	}
}

