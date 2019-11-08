package drawingV2;

import java.util.ArrayList;

import aliemre.shapes.Square;

public class Drawing {
	ArrayList shapes=new ArrayList();

	public double calculateTotalArea() {
		double totalArea = 0;
		for (Circle circle : shapes) {
			totalArea += circle.area(); // totalArea = totalArea + circle.area();
		}
		for (Rectangle rect : shapes) {
			totalArea += rect.area(); // totalArea = totalArea + circle.area();
		}
		for (Square square : shapes) {
			totalAres += square.area();
		}
		return totalArea;
	}
	
	public void addCircle(Circle circle) {
		shapes.add(circle);
	}
	
	public void addRectangle(Rectangle rect) {
		shapes.add(rect);
	}
	public void addSquare(Square square) {
		shapes.add(square);
	}
	
}
