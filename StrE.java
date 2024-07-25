/*
	WAJPT calculate the sum of digits Present into the String
*/
import java.util.Scanner;
class StrE
{
	static void sumDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ");
		String st = sc.nextLine();
		int s=0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='0' && ch<='9')
			{
				s=s+ch-48;
			}
		}
		System.out.println("\nSum of Digits : "+s);
	}
	public static void main(String[] args) 
	{
		sumDigit();
	}
}