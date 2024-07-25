//input three int then print the smallest int using Ternary Oprator
import  java.util.Scanner;
class CheckSmallest{
	public static void main(String[] args){
		System.out.println("Enter the three nunmbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sml = a;
		sml = (b<c)?b:c;
		sml = (sml<a)?sml:a;
		System.out.println("Smallest Number = "+sml);
	}
} 