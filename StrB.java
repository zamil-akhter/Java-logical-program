/*
	WAJPT count how many digits Present into the String
*/
import java.util.Scanner;
class StrB
{
	static void countDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("Total Digits = "+count);
	}
	public static void main(String[] args) {
		countDigit();
	}
}