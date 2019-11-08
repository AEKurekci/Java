public class FindPrimes{
public static void main(String[] args){
int sayi=Integer.parseInt(args[0]);

	for(int x=sayi;x>0;x--){
		int result=0;
		for(int i=1;i<=x;i++){
			if(x%i==0){
				result++;
			}
		
		}
		if(result==2){
			System.out.println(x);
		}
	}
}}
