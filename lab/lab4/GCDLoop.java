public class GCDLoop{
public static void main(String[] args){
	int value1=Integer.parseInt(args[0]);
	int value2=Integer.parseInt(args[1]);
	int GCD=0;
	int bigone=0;
	if(value1>value2)
		bigone=value1;
	else if(value1<value2)
		bigone=value2;
	else
		GCD=value1;
	for(int i=1;i<bigone;i++){
		if(value1%i==0 && value2%i==0)
			GCD=i;
	}
	System.out.println(GCD);
}
}
