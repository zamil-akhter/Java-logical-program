/*
	WAJPT count how many character present in each word
*/
import java.util.Scanner;
class StrK
{
	static void countChar()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Sentence");
		String st = scn.nextLine();
		char ch[] = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int ccount=0;
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				for(int j=0;j=(ch[i]=0);j++)
				{
					ccount++;
				}
				System.out.println(ccount);
			}	
		}
	}
	public static void main(String[] args) 
	{
		countChar();
	}
}