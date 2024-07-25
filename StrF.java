/*
	WAJPT count how many words Present into the Sentence
*/
import java.util.Scanner;
class StrF
{
	static void countWord()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Sentence");
		String st = scn.nextLine();
		char ch[] = st.toCharArray();
		int sc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				sc++;	
		}
		System.out.println("Total Word : "+(sc));
	}
	public static void main(String[] args) 
	{
		countWord();
	}
}