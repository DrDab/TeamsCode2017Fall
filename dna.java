import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dna 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("dna.txt"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		for (int i = 0; i < length; i++) {
			char[] aa = br.readLine().toCharArray();
			char[] bb = br.readLine().toCharArray();
			//System.out.println(Arrays.toString(aa));
			//System.out.println(Arrays.toString(bb));
			boolean ff = false;
			for (int k = 0; k < aa.length; k++)
			{
				if (!isValid(aa[k], bb[k]))
				
				{
					System.out.println("Invalid");
					ff = true;
					break;
				}
			}
			if (!ff)
			{
			System.out.println("Valid");
			}
		}
	}
	public static boolean isValid(char a, char b)
	{
		if ((a == 'A' && b == 'T') || (a == 'T' && b == 'A'))
		{
			return true;
		}
		else if ((a == 'C' && b == 'G') || (a == 'G' && b == 'C'))
		{
			return true;
		}
		return false;
	}
}
