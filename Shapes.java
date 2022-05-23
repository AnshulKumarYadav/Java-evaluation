package com.eval1;

public class Shapes {
	public void area(int r)
	{
		
		System.out.println("Area of circle:"+r*r);
	}
	public void arear(int l, int b) {
		System.out.println("Area of rectangle:"+(l*b));
	}
	public void areas(int s) {
		System.out.println("Area of square :"+s*s);
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		int r = circle.radius = 7;
		Shapes shapes = new Shapes();
		shapes.area(r);
		Rectangle lbRectangle = new Rectangle();
		int l = lbRectangle.length = 4;
		int b =  lbRectangle.breadth=5;
		shapes.arear(l,b);
		Square sides= new Square();
		int s= sides.side = 4;
		shapes.areas(s);
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
