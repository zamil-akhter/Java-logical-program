//input any year then check leap year or not
import  java.util.Scanner;
class CheckLeap{
	public static void main(String[] args){
		System.out.println("Enter any year");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(y%400 == 0 || y%4 == 0 && y%100 != 0)
		{
		   System.out.println("Leap Year");
		}
		else
		{
		   System.out.println("Not Leap Year");
		}
	}
} 