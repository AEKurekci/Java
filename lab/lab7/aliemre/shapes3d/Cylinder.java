package aliemre.shapes3d;
import aliemre.shapes.Circle;

public class Cylinder extends Circle {

	int height,radius;
	public Cylinder(int r,int h){
		super(r);
		radius=r;
		height=h;
		
	}
	public double ClinderArea() {
		return (2*3.14*radius*height)+(2*super.area());
		
	}
	public double ClinderVolume() {
		return super.area()*height;
	}
	

}
