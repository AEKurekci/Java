package lab;

public class Main {

	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(5,6);
		Circle circ1=new Circle(10);
		System.out.println("For rectangle, area is "+rec1.area()+" and perimeter is "+rec1.perimeter());
		System.out.println("For circle, area is "+circ1.area()+" perimeter is "+circ1.perimeter());
	}
}
