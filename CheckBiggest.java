//input four int then print the biggest int using Ternary Oprator
import  java.util.Scanner;
class CheckBiggest{
	public static void main(String[] args){
		System.out.println("Enter the four nunmbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int big = a;
		big = (b>c)?b:c;
		big = (big>a)?big:a;
		big = (big>d)?big:d;
		System.out.println("Biggest Number = "+big);
	}
} 