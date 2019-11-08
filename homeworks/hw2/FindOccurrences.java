import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FindOccurrences {
	
	public static void main(String[] args) {
		int[][] matrix = readMatrix();
		//print the occurrences 
		int zero=0;
		int one=0;
		int two=0;
		int tree=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine=0;
		System.out.println(matrix[9][9]);

		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(matrix[i][j] == 0)
					zero++;
				else if(matrix[i][j] == 1)
					one++;
				else if(matrix[i][j]==2)
					two++;
				else if(matrix[i][j]==3)
					tree++;
				else if(matrix[i][j]==4)
					four++;
				else if(matrix[i][j]==5)
					five++;
				else if(matrix[i][j]==6)
					six++;
				else if(matrix[i][j]==7)
					seven++;
				else if(matrix[i][j]==8)
					eight++;
				else 
					nine++;					
			}
		
		}
		System.out.println("0 occurs "+zero+" time(s)");
		System.out.println("1 occurs "+one+" time(s)");
		System.out.println("2 occurs "+two+" time(s)");
		System.out.println("3 occurs "+tree+" time(s)");
		System.out.println("4 occurs "+four+" time(s)");
		System.out.println("5 occurs "+five+" time(s)");
		System.out.println("6 occurs "+six+" time(s)");
		System.out.println("7 occurs "+seven+" time(s)");
		System.out.println("8 occurs "+eight+" time(s)");
		System.out.println("9 occurs "+nine+" time(s)");


	}


		
	private static int[][] readMatrix(){
		int[][] matrix = new int [10][10];
		File file = new File("matrix.txt");

	    try {

	        Scanner sc = new Scanner(file);
	        int i = 0;
	        int j = 0;
	        while (sc.hasNextLine()) {
	            int number = sc.nextInt();
	            matrix[i][j] = number;
	            if (j == 9)
	            	i++;
	            j = (j + 1) % 10;
	            if (i==10)
	            	break;
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }		
		return matrix;
	}
	
}
