package com.eval1;

public class Shapes {
	public void area(Circle circle)
	{
		int r = circle.radius=7;
		System.out.println("Area of circle:"+(22/7)*r*r);
	}
	public void area(Rectangle rectangle) {
		int l = rectangle.length=8;
		int b = rectangle.breadth=7;
		System.out.println("Area of rectangle:"+(l*b));
	}
	public void area(Square square) {
		int s = square.side=46;
		System.out.println("Area of square :"+s*s);
	}

}
class Circle{
	int radius;
}
class Rectangle{
	int length;
	int breadth;
}
class Square{
	int side;
}

class Main2{
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		shapes.area(new Circle());
		shapes.area(new Rectangle());
		shapes.area(new Square());
		
	}
}
