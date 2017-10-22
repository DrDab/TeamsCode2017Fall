import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class playground {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("playground.txt"));
		int n = file.nextInt();
		for (int i = 1; i <= n; i++) {
			int price = file.nextInt();
			int budget = file.nextInt();
			double perimeter = (double) budget / (double) price;
			double pair = perimeter / 2;
			double length = pair / 2;
			double width = pair - length;
			System.out.println(Math.round(length * width));
			
		}
	}

}
