//input a number then check
import  java.util.Scanner;
class MainSpecial{
   public static void main(String[] args){
	System.out.println("Enter the nunmber");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean rs = isSpecialTwoDigit(n);
	if(rs == true)
	   System.out.println(n+" is a Special Number");
	else
	   System.out.println(n+" is not a Special Number");
   }
   static boolean isSpecialTwoDigit(int n)
   {
	int d1=n/10;
	int d2=n%10;
	int sum = d1*d2 + d1+d2;
	return sum == n;
   }
} 
