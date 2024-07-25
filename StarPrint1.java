import java.util.Scanner;
class StarPrint1{
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
	    for(int j=1;j<=n;j++)
	    {
		if(i==j || i+j==n+1 || i==(n+1)/2 || j==(n+1)/2)
		    System.out.print("* ");
		else
		    System.out.print("  ");
	    }
	    System.out.println();
        }
    }
}