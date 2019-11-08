package lab;

public class Circle {

	int radius;
	public Circle(int r){
		radius=r;
	}
	
	public double area() {
		double result=2*(3.14);
		return result*radius;
	}
	public double perimeter() {
		return 3.14*radius*radius;
	}
}
