package aliemre.shapes3d;

import aliemre.shapes.Square;

public class Cube extends Square{
	int side;
	public Cube(int s) {
		super(s);
		side=s;
	}
	
	public int volume() {
		return side*super.area();
	}

}
