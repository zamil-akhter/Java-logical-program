//input a int then check it is devisible or not by 3, 5 & both
import  java.util.Scanner;
class CheckDivisible{
   public static void main(String[] args){
	System.out.println("Enter the nunmbers");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n%3 == 0 && n%5 == 0)
	   System.out.println("Sanju weds Geeta");
	else if(n%3 == 0)
	   System.out.println("Sanju");
	else if(n%5 == 0)
	   System.out.println("Geeta");
	else
	   System.out.println("Breakup");
   }
} 