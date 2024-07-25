/*
	WAJPT count how many Alphabet, digits and Special Character Present into the String
*/
import java.util.Scanner;
class StrD
{
	static void countS()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int a=0, d=0, s=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
			{
				a++;
			}
			else if(ch[i]>='0' && ch[i]<='9') 
			{
				d++;
			}
			else 
			{
				s++;
			}
		}
		System.out.println("\nDigits : "+d+"\nahabets : "+a+"\nSpecial Character : "+s);
	}
	public static void main(String[] args) 
	{
		countS();
		System.out.println((char)' ');
	}
}