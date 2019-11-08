public class GCDRec{
public static void main(String[] args){
	int value1=Integer.parseInt(args[0]);
	int value2=Integer.parseInt(args[1]);
	if(value1>value2)
		System.out.println(FindGCD(value1,value2));
	else
		System.out.println(FindGCD(value2,value1));
}
static int FindGCD(int Value1, int Value2){
	int Value=Value2;
	if(Value1%Value2!=0){
		Value2=Value1%Value2;
		Value2=FindGCD(Value,Value2);
	}
	
	return Value2;
	}
}
