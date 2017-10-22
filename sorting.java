import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sorting
{
	public static void main (String[] args) throws IOException
	{
    ///media/citrus/PSCSTA/JudgeFiles/sorting.txt
		BufferedReader br = new BufferedReader(new FileReader("sorting.txt"));
		int length = Integer.parseInt(br.readLine());
		int[]combos  = new int[length];
		for(int i = 0; i < length; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int part1 = Integer.parseInt(st.nextToken());
			combos[i]=part1;
		}
		Arrays.sort(combos);
		for (int dd = length -1; dd >= 0; dd--)
		{
			System.out.println(combos[dd]);
		}
	}
}
