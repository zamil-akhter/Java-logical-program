/*
	WAJPT count how many Vowels and Consonent Present into the String
*/
import java.util.Scanner;
class StrC
{
	static void countVowel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int vc=0,cc=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z'))
			{
				if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || 
				   ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
		}
		System.out.println("Total Vowel     "+vc);
		System.out.println("Total Consonent "+cc);
	}
	public static void main(String[] args) {
		countVowel();
	}
}