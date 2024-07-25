/* print like this
*****
****
***
**
*
*/
import java.util.Scanner;
class StarPrint3{
    public static void main(String[] args){
	System.out.println("Enter value of n");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printIt(n);
    }
    static void printIt(int n)
    {
	for(int i=n;i>=1;i--)
	{
	    for(int j=1;j<=i;j++)
	    {
		System.out.print("* ");
	    }
	    System.out.println();
        }
    }
}