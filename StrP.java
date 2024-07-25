/*
	WAJPT check string is palindrome or not
*/
import java.util.Scanner;
class StrP
{
	static String readString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		return st;
	}
	static boolean isPalindrom(String st)
	{
		int i=0,j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!= st.charAt(j))
					return false;
			i++;
			j++;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String a = readString();
		boolean c = isPalindrom(a);
		if(c==true)
			System.out.println("\nYes ! it is Palindrome ");
		else
			System.out.println("\nNot Palindrome ");
	}
}