import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = {{0,0,1},{1,0,0}};
		matrix = flipItVerticalAxis(matrix);
		
		for(int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static int[][] flipItVerticalAxis(int[][] matrix) {
	    int iterations = matrix[0].length/2;
	    int index1, index2, aux;
	    
	    for(int i=0; i<matrix.length; i++){
	        index1 = 0;
	        index2 = matrix[i].length-1;
	        for(int j=0; j<iterations; j++){
	            aux = matrix[i][index1+j]; 
	            matrix[i][index1+j] = matrix[i][index2-j];
	            matrix[i][index2-j] = aux;
	        }
	    }
	    
	    return matrix;
	}
	
}

