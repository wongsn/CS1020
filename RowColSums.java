// RowColSums.java
// To compute the row and column sums of a 2D array.
import java.util.*;

class RowColSums {
	private int[][] array2D;
	private int[] rowSums, colSums;
	private int rows, cols;
	
	public int computeRowSums(Arrays aRow){
		for(int j = 0, j<rows-1,){
			for(int i =0, i<aRow.length-1, i++){
			rowSums[j] += aRow[i];
			}
		}
	}

	public int computeColSums(Arrays aCol){
		for(int x = 0, x<cols-1,){
			for(int y =0, i<aCol.length-1, y++){
			colSums[x] += aCol[y];
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows and columns: ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		for(int i=0, i<rows.length, i++){
			for(int j=0, j<columns.length, j++){
				int[i][j] rowSums = sc.nextInt();
			}
		}


		int[] rowSums = computeRowSums(array2D);
		System.out.print("Row sums: ");
		System.out.println(Arrays.toString(rowSums));

		int[] colSums = computeColSums(array2D);
		System.out.print("Column sums: ");
		System.out.println(Arrays.toString(colSums));
	}

}