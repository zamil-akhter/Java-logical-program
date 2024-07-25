//input three int then print the smallest int using Logical Oprator
import  java.util.Scanner;
class CheckSmallest1{
   public static void main(String[] args){
	System.out.println("Enter the three nunmbers");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int sml;
	if(a<b && a<c)
	   sml = a;
	else if(b<c)
	   sml = b;
	else
	   sml = c;
	System.out.println("Smallest Number = "+sml);
   }
} 