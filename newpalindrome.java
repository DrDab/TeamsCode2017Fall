import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class palindrome 
{
	public static int lps(String str)
	{
		int n = str.length();
		int L[][] = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			L[i][i]=1;
		}
		for (int c1 = 2; c1 <= n; c1++)
		{
			for (int i = 0; i < n - c1 + 1; i++)
			{
				int j = i + c1 - 1;
				if (str.charAt(i) == str.charAt(j) && c1 == 2)
					L[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j))
					L[i][j] = L[i+1][j-1] + 2;
				else
					L[i][j] = Integer.max(L[i][j-1], L[i+1][j]);
			}
		}
		return L[0][n-1];
	}
	public static int minNumDeletions(String str)
	{
		int n = str.length();
		int len = lps(str);
		return n - len;
	}
	public static String removeSpaces(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		for(;;)
		{
			if (getSpaceIndex(sb) == -1) // there are no more spaces!
			{
		//		System.out.println(sb.toString());
				return sb.toString();
			}
			else
			{
				sb.deleteCharAt(getSpaceIndex(sb));
			}
		}
	}
	public static int getSpaceIndex(StringBuilder str)
	{
		char[] s = str.toString().toCharArray();
		for (int i = 0; i < s.length; i++)
		{
			if (s[i] == ' ')
			{
				return i;
			}
		}
		return -1;
	}
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("palindrome.txt"));
		int length = Integer.parseInt(br.readLine());
		for(int i = 0; i < length; i++)
		{
			String s = br.readLine();
		//	System.out.println(s);
			System.out.println(minNumDeletions(removeSpaces(s)));
		}
	}
}
