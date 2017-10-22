import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class time 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("/media/citrus/PSCSTA/JudgeFiles/time.txt"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		for (int i = 0; i < length; i++)
		{
			int seconds = Integer.parseInt(br.readLine());
			long getDays = seconds / 60 / 60 / 24;
			long getHours = (seconds/60/60)%24;
			long getMins = (seconds / 60)%60;
			long getSecs = (seconds % 60);
			//double getSeconds = seconds / 60 / 60 / 24
			System.out.println(getDays + " days " + getHours + " hrs " + getMins + " mins " + getSecs + " sec");
		}
	}
}
