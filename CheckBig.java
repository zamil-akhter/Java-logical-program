//input four int then print the biggest int using IF
import  java.util.Scanner;
class CheckBig{
	public static void main(String[] args){
		System.out.println("Enter the four nunmbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int big;
		if(a>b)
		{
		   if(a>c)
		   {
		      if(a>d)
		      {
			big=a;
		      }
		      else
		      {
			big=d;
		      }
		   }
		   else if(c>d)
		   {
		      big=c;
		   }
		   else
		   {	
		      big=d;
		   }
		}
		else if(b>c)
		{
		   if(b>d)
		   {
		      big=b;
		   }
		   else
		   {
		      big=d;
		   }
		}
		else if(c>d)
		{
		   big=c;
		}
		else
		{
		   big=d;
		}
		System.out.println("Biggest Number = "+big);
	}
} 