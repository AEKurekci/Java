public class Int2Bin{
public static void main(String[] args){
	String whichOne=new String(args[0]);
	int value=Integer.parseInt(args[1]);
	System.out.println(Integer.toBinaryString(value));
	System.out.println(Integer.toString(0));

	if(whichOne.equals("loop"))
		System.out.println(loop(value));
	else if(whichOne.equals("rec"))
		System.out.println(rec(value));
	else
		System.out.println("Wrong Input");
}
public static int loop(int Value){
	return 1;
}
public static int rec(int Value){
	if(Value<=0)
		return 0;
	else{
			
		//int y=;
		String x=Integer.toString(Value%2);
		String z=x+Integer.toString(rec(Value/2));
		return Integer.parseInt(z);
	}
}

}
