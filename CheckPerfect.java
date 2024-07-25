//input a int then check num is prfect or not
import  java.util.Scanner;
class CheckPerfect{
   public static void main(String[] args){
	System.out.println("Enter the nunmbers");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i,sum=0;
	for(i=1;i<n;i++)
	{
	   if(n%i==0)
	      sum=sum+i;
	}
	if(sum==n)
	   System.out.println(n+" is a Perfect Number");
	else
	   System.out.println(n+" is Not a Perfect Number");
   }
} 