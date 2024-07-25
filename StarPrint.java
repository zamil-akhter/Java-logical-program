import java.util.Scanner;
class StarPrint{
    public static void main(String[] args){
	System.out.println("Enter any Number");
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
		if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1)
		    System.out.print("* ");
		else
		    System.out.print("  ");
	    }
	    System.out.println();
        }
}
}