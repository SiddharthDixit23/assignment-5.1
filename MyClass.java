package inherit;
import java.util.*;
import java.lang.*;
abstract class Figure {

	double dim1,dim2;
	abstract void input();
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure
{
	void input()
	{
	System.out.println("Enter radius of the circle: ");
	Scanner a = new Scanner(System.in);
	dim1 = a.nextFloat();
	}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double ar = 3.14*dim1*dim1;
		System.out.println("Area of the circle is "+ar);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double pm = 2*3.14*dim1;
		System.out.println("Perimeter of the circle is "+pm);
	}
	
}
class Rectangle extends Figure
{
	@Override
	void input()
	{
	System.out.println("Enter length of the rectangle: ");
	Scanner a = new Scanner(System.in);
	dim1 = a.nextFloat();
	System.out.println("Enter breadth of the rectangle: ");
	dim2 = a.nextFloat();
	}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double ar = dim1*dim2;
		System.out.println("Area of the rectangle is "+ar);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double pm = 2*(dim1+dim2);
		System.out.println("Perimeter of the rectangle is "+pm);
	}
	
}
class Triangle extends Figure
{
	@Override
	void input()
	{
	System.out.println("Right angled triangle is considered.");
	System.out.println("Enter base of the triangle: ");
	Scanner a = new Scanner(System.in);
	dim1 = a.nextFloat();
	System.out.println("Enter height of the rectangle: ");
	dim2 = a.nextFloat();
	}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double ar = (dim1*dim2)/2;
		System.out.println("Area of the triangle is "+ar);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double w = Math.hypot(dim1,dim2);
		double pm = w+dim1+dim2;
		System.out.println("Perimeter of the triangle is "+pm);
	}
	
}

class MyClass
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.input();
		c.findArea();
		c.findPerimeter();
		Rectangle r = new Rectangle();
		r.input();
		r.findArea();
		r.findPerimeter();
		Triangle t = new Triangle();
		t.input();
		t.findArea();
		t.findPerimeter();
	}
}