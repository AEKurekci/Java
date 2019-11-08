public class MatrixCalculator{

	public static void main(String[] args){
		int[][] matrixA={{6,8,2},{9,5,11},{7,2,5}};
		int[][] matrixB={{4,6,3},{5,8,1},{6,6,7}};
		//System.out.println(matrixA[0][0]+matrixB[0][0]);

		for(int i=0;i<matrixA.length;i++){
			for(int j=0;matrixA.length;j++){
				System.out.println(add(matrix1[i][j],matrix2[i][j]));
			}
		}
	}

	public int[][] add(int[][] matrix1, int[][] matrix2){
		
		int result=(matrix1[0][0]+matrix2[0][0]);
		return result; 
		//int Solution=Integer.parseInt(matrixA[MatrixA[0]][MatrixA[0]] + matrixB[MatrixB[1]][MatrixB[1]]);
		

	}
}
