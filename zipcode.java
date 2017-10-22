import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class zipcode {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("zipcode.txt"));
		int length = Integer.parseInt(br.readLine());
		boolean[] locs = new boolean[length];
		for(int i = 0; i < length; i++)
		{
			// read in the data for one observation
			StringTokenizer st = new StringTokenizer(br.readLine());
			int mine = Integer.parseInt(st.nextToken());
			int friends = Integer.parseInt(st.nextToken());
			System.out.println(getClosest(mine, friends) + " " + Math.abs(friends - getClosest(mine, friends)));
		}
	}
	public static int getClosest(int mine, int friends) {
		int p = 0;
		for (;;) {
			if (containsChars(mine, friends + p)) {
				return friends + p;
			}
			if (containsChars(mine, friends - p)) {
				return friends - p;
			}
			p++;
		}
	}
	public static boolean containsChars(int mine, int friends) {
		String aa = mine + "";
		String bb = friends + "";
		char[] aaa = aa.toCharArray();
		char[] bbb = bb.toCharArray();
	//	System.out.println(Arrays.toString(aaa));
		//System.out.println(Arrays.toString(bbb));
		int complete = aaa.length;
		int gen = 0;
	//	System.out.println(words);
		//System.out.println(targetwords);
		for (int k = 0; k < aaa.length; k++)
		{
			if (contains(bbb, aaa[k])) 
			{
				gen++;
				bbb[containsLoc(bbb, aaa[k])] = 'z';
			}
		}
		if (gen == 5) {
			return true;
		}
		return false;
	}
	public static boolean contains(char[] is, char b)
	{
		for (int i = 0; i < is.length; i++)
		{
			if (is[i] == b)
			{
				return true;
			}
		}
		return false;
	}
	public static int containsLoc(char[] is, char b)
	{
		for (int i = 0; i < is.length; i++)
		{
			if (is[i] == b)
			{
				return i;
			}
		}
		return -1;
	}
}
