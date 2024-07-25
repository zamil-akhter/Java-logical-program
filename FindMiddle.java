//input three distinct int then print the middle
import  java.util.Scanner;
class FindMiddle{
	public static void main(String[] args){
		System.out.println("Enter the three nunmbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big = a;
		big = (b>c)?b:c;
		big = (big>a)?big:a;
		int sml = a;
		sml = (b<c)?b:c;
		sml = (sml<a)?sml:a;
		if(a!=sml && a!=big)
		   System.out.println("Middle Number = "+a);
		else if(b!=sml && b!=big)
		   System.out.println("Middle Number = "+b);
		else
		   System.out.println("Middle Number = "+c);
	}
} 