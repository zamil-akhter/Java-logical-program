/*
	WAPT count the frequency of character from a string
*/
import java.util.Scanner;
class StrM
{
	static void countFreq()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		int count[] = new int[128];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+"  --->   "+count[i]);
		}
	}
	public static void main(String[] args)
	{
		countFreq();
	}
}