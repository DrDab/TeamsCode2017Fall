import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class spelling
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("spelling.txt"));
		int length = Integer.parseInt(br.readLine());
		int[]combos  = new int[length];
		for(int i = 0; i < length; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			String word = st.nextToken();
			int collectionl = Integer.parseInt(st.nextToken());
			char[] words = word.toCharArray();
			char[] targetwords = new char[collectionl];
			for (int pp = 0; pp < collectionl; pp++)
			{
			//	System.out.println(st.nextToken());
			targetwords[pp] = st.nextToken().charAt(0);
			}
			int complete = word.length();
			int gen = 0;
		//	System.out.println(words);
			//System.out.println(targetwords);
			for (int k = 0; k < targetwords.length; k++)
			{
				if (contains(words, targetwords[k])) 
				{
					gen++;
					words[containsLoc(words, targetwords[k])] = 0;
				}
			}
			if (gen == complete)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
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
