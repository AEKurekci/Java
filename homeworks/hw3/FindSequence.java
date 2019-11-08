import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindSequence {

	public static void main(String[] args) {
		int matrix[][] = readMatrix();
		/*
		int[][] matrix2 = new int[10][10];
		int counter = 0;
		
		for(int i=0;i<10;i++) {
			for(int j;j<10;j++) {
				if(matrix[i][j]==0) {
					for(int k=1;k<10;k++) {
						if(matrix[i][j+1]==k || matrix[i][j-1]==k || matrix[i-1][j]==k || matrix[i+1][j]==k) {
							matrix2[][]
							continue;
						}
						else
							break;
					}
				}
			}
		}	
		
		
		*/
		printMatrix(matrix);

	}
	//public static int challenge(control[][]) {}


	private static int[][] readMatrix() {
		int[][] matrix = new int[10][10];
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
				if (i == 10)
					break;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}	
	}
}

