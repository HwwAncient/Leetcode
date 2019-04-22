package Two_Array;

import java.util.ArrayList;
import java.util.List;

public class Diagonal {

	public static void main(String[] args) {
		
		
	}
	
	 public static int[] findDiagonalOrder(int[][] matrix) {
		 
		 int num = matrix.length;
		 int nLayer = 2 * num - 1;
		 List<Integer> results = new ArrayList<Integer>();
		 for(int i = 0;i < nLayer;i++)
			 for(int result:findLayerNum(matrix, i)) 
				 results.add(result);
		 
		 int[] dia = results.stream().mapToInt(Integer::valueOf).toArray();
		 return dia;
		 
	 }
	 
	 public static int[] findLayerNum(int[][] matrix, int nlayer) {
		 int num = matrix.length;
		 //TODO complete this function
		 return null;
	 }
}
