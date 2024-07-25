/*
*
**
***
****
*****
*/
import java.util.Scanner;
class StarPrint2{
    public static void main(String[] args){
	System.out.println("Enter value of n");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printIt(n);
    }
    static void printIt(int n)
    {
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=i;j++)
	    {
		System.out.print("* ");
	    }
	    System.out.println();
        }
    }
}