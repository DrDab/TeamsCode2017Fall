import java.io.*;
import java.util.*;

public class magic {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("magic.txt"));
		int n = file.nextInt();
		for (int i = 1; i <= n; i++) {
			int[][] square = new int[3][3];
			for (int j = 0; j < square.length; j++) {
				for (int k = 0; k < square[j].length; k++) {
					square[j][k] = file.nextInt();
				}
			}
			int count = findRows(square) + findCols(square) + findDiagonals(square);
			System.out.println(count);
		}
	}
	
	public static int findRows(int[][] mat) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat[i].length; j++) {
				sum += mat[i][j];
			}
			if (sum != 15) {
				count++;
			}
		}
		return count;
	}
	
	public static int findCols(int[][] mat) {
		int count = 0;
		for (int i = 0; i < mat[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < mat.length; j++) {
				sum += mat[j][i];
			}
			if (sum != 15) {
				count++;
			}
		}
		return count;
	}
	
	public static int findDiagonals(int[][] mat) {
		int count = 0;
		for (int i = 1; i <= 2; i++) {
			int sum = 0;
			if (i == 1) {
				for (int j = 0; j < mat.length; j++) {
					sum += mat[j][j];
				}
			} else {
				for (int j = mat.length - 1; j >= 0; j--) {
					sum += mat[j][mat.length - 1 - j];
				}
			}
			if (sum != 15) {
				count++;
			}
		}
		return count;
	}

}
