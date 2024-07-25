/*
	WAPT count the frequency of each alphabet of given string
*/
import java.util.Scanner;
class StrN
{
	static void countFreq()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String st = sc.nextLine();
		int count[] = new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count[ch-65]++;
			}
			if(ch>='a' && ch<='z')
			{
				count[ch-97]++;
			}
		}
		System.out.println();
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65)+"   ---->  "+count[i]);
		}
	}
	public static void main(String[] args)
	{
		countFreq();
	}
}