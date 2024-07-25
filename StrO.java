/*
	WAJPT check two string are Anagram or not
*/
import java.util.Scanner;
class StrO
{
	static String readString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		return st;
	}
	static int[] countFreq(String st)
	{
		int count[] = new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		return count;
	}
	static boolean isAnagram(String s1, String s2)
	{
		int c1[] = countFreq(s1);
		int c2[] = countFreq(s2);
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = readString();
		String b = readString();
		boolean c = isAnagram(a,b);
		if(c==true)
			System.out.println("\nYes ! it is Anagram ");
		else
			System.out.println("\nNot Anagram ");
	}
}