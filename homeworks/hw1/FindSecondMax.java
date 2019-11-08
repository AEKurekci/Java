public class FindSecondMax{

	public static void main(String[] args){
	int max=0;
	int SecMax=0;

	for(int i=0;i<args.length;i++){
		if(Integer.parseInt(args[i]) > SecMax || Integer.parseInt(args[i]) > max){
			if(Integer.parseInt(args[i])>max){		
				SecMax=max;
				max=Integer.parseInt(args[i]);
			}
			else
				SecMax=Integer.parseInt(args[i]);
			
		}		
		
					
	}
	if(max != SecMax)
		System.out.println(SecMax);
	else
		System.out.println("There is no second maximum value");
}
}
