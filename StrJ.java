/*
	WAJPT swap every word first character with the same word last character
*/
import java.util.Scanner;
class StrJ
{
	static void swapChar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char t=ch[f];
				ch[f] = ch[i];
				ch[i] = t;
			}
		}
		st = new String(ch);
		System.out.println(ch);
	}
	public static void main(String[] args)
	{
		swapChar();
	}
}