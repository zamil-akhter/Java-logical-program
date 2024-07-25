/*
	WAJPT count how many Capital Letters and Small Letters Present into the String
*/
import java.util.Scanner;
class StrA
{
	static void countCase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String : ");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int uc=0,lc=0;
		for(int i=0;i<ch.length;i++)
		{			
			if(ch[i]>='A' && ch[i]<='Z')
				uc++;
			else if(ch[i]>='a' && ch[i]<='z')
				lc++;
		}
		System.out.println("Total Upper Case = "+uc);
		System.out.println("Total Lower Case = "+lc);
	}
	public static void main(String[] args) 
	{
		countCase();		
	}
}

