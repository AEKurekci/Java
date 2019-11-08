package aliemre.shapes;

public class Circle {
	int radius;
	public Circle(int r) {
		radius=r;
		
	}

	public double area() {
		
		return radius*radius*3.14;
	}
}
