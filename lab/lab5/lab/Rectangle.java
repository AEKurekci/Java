package lab;

public class Rectangle {

	int sideA;
	int sideB;
	public Rectangle(int x,int y) {
		sideA=x;
		sideB=y;
	}
	public int area(){
		
		return sideA*sideB;
	}
	
	public int perimeter() {
		
		return 2*(sideA+sideB);
	}
}

