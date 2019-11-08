package drawing;

public class Deneme extends Main{
	public static int max(int a, int b) {
		if(a>b)
			return a;
		else if(b>a)
			return b;
		else
			return 0;
	}
	public void X() {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
				if(i==j || i+j==6) {
					System.out.print("X");
				}else {
					System.out.print("_");
				}
			System.out.println("");
		}		
	}
	
	
	
	public int[] first50PrimeNumber() {
		
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
		return primeNumbers;
	}
	
	
}
