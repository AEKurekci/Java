package aliemre.main;
import aliemre.shapes3d.*;

public class Test3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder=new Cylinder(3,5);
		Cube cube = new Cube(5);
		System.out.println(cube.area());
		System.out.println(cylinder.ClinderArea());
		System.out.println(cylinder.ClinderVolume());
		System.out.println(cube.volume());

		
	}

}
