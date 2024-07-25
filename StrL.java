/*
	WAJPT check string is pangram or not
*/
import java.util.Scanner;
class StrL
{
	static String readString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		return st;
	}

	static boolean checkPangram(String st)
	{
		if(st.length()<26)
			return false;
		int count[] = new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}

	//  Second Logic for check Pangram 
	/*
	
	static boolean checkPangram(String st)
	{
		if(st.length()<26)
			return false;
		for(char c1='A',c2='a'; c1<'z';c1++,c2++)
		{
			if(st.indexof(c1)==-1 && st.indexof(c2)==-1)
				return false;
		}
		return true;
	}

	*/
	



	public static void main(String[] args) 
	{
		String str = readString();
		boolean a = checkPangram(str);
		if(a==true)
			System.out.println("\nYes ! This is Pangram ");
		else
			System.out.println("\nNot Pangram ");
	}
}