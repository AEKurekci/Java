package drawing;

public class Main {

	public static void main(String[] args) {
		/*Rectangle r = new Rectangle("Green", 5, 6);
		Box bx=new Box("Blue",5,6,4);
		Circle c = new Circle("Red",5);
		Deneme deneme=new Deneme();
		System.out.println(deneme.max(10, 10));
		deneme.X();
		
		
		
		System.out.println(c.area());
		System.out.println(bx.area());
		//Ball b  = new Ball("Red",5);
		
		//System.out.println(b.volume());
		
		//System.out.println(b.area());
		
		
		System.out.println(c);
		
		System.out.println(r.hashCode());
		
		Circle c2 = new Circle("Red",5);
		
		if (c2.equals(c)) {
			System.out.println("Same Radius");
		}
		
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		if (str != str2) {
			System.out.println("Different Objects");
		}
		
		if (str.equals(str2)) {
			System.out.println("Same Content");
		}
		
	}*/
	/*
		int counter2=0;
		int[] primeNumbers = new int[50];
		for(int j=1;j<primeNumbers.length;j++){
			int counter=0;
			for(int i=1;i<=j;i++){
				if(j%i==0)
					counter++;
			}
			if(counter==2) {
				primeNumbers[counter2]=j;
				counter2++;
				
			}
				
		}
		for(int a=0;a<primeNumbers.length;a++) {
			System.out.print(primeNumbers[a]+ " ");}*/
		System.out.println(Bin(175));
		}
	public static String Bin(int a) {
		if(a==1)
			return 1+"";
		return Bin(a/2)+""+a%2;
	}
	public static String Hexa(int h) {
		if(h==10)
			return "A";
		else if(h==11)
			return "B";
		return Hexa(h%10000)+"";
	}
	

}
