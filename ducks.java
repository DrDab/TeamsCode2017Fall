import java.io.*;
import java.util.*;

/**
 * This program compiled successfully w/test data, but judge data threw one wrong test case. 
 * I currently do not know the cause.
 * @author victor
 * @author alex
 */
public class ducks {
	public static void main(String[] args) throws FileNotFoundException {
		///media/citrus/PSCSTA/JudgeFiles/
		Scanner file = new Scanner(new File("ducks.txt"));
		int n = file.nextInt();
		for (int i = 1; i <= n; i++) {
			double p = file.nextDouble();
			String day = file.next();
			int date = getDate(day);
			for (int j = 1; j <= date; j++) {
				if (j  % 10 == 0) {
					p *= 2;
				}
				if (j == date) {
					break;
				}
				if (j % 24 == 0) {
					p -= p / 4;
				}
			}
			System.out.println(Math.round(p));
		}
	}
	
	public static int getDate(String date) {
		int mm = Character.getNumericValue(date.charAt(0)) * 10 + 
				Character.getNumericValue(date.charAt(1));
		int dd = Character.getNumericValue(date.charAt(3)) * 10 +
				Character.getNumericValue(date.charAt(4));
		int sum = 0;
		for (int i = 1; i < mm; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
				sum += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			} else {
				sum += 28;
			}
		}
		return sum + dd;
		
	}

}
