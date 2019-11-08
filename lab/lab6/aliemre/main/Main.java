package aliemre.main;
import aliemre.shapes.Circle;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args){
		Circle circ1=new Circle(2);
		Circle circ2=new Circle(1);
		Circle circ3=new Circle(3);
		ArrayList<Circle> myArray=new ArrayList<Circle>();
		myArray.add(circ1);
		myArray.add(circ2);
		myArray.add(circ3);
		for(int i=0;i<myArray.size();i++)
		{
			System.out.println(myArray.get(i).area());
		}
	}

}
