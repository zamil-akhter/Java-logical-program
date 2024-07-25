/*
	WAJPT check specified string is present in the given string or not
*/
import java.util.Scanner;
class StrQ
{
	static String readString()
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		return st;
	}
	static boolean isPresent(String a, String b)
	{
		char c1 = a.tocharArray();
		char c2 = b.tocharArray();
		for(int i)




	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String : ");
		String a = readString();
		System.out.println("What do you want to search : ");
		String b = readString();
		boolean c = isPresent(a);
		if(c==true)
			System.out.println("\nYes ! it is Present ");
		else
			System.out.println("\nNot Present ");
	}
}