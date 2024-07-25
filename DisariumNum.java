import java.util.Scanner;
class DisariumNum{
    public static void main(String[] args){
	System.out.println("Enter Starting Number");
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	System.out.println("Enter Ending Number");
	Scanner sc1 = new Scanner(System.in);
	int n = sc1.nextInt();
	int i,j;
	for(i=m;i<=n;i++)
	{
	    int d=0;
	    int p=i;
	    while(p>0)
	    {
		p=p/10;
		d++;
		p--;
	    }
	    for(j=1;j<=d;j++)
	    {
		System.out.println(Math.pow(i,j));
	    }
	}
    }
}
//System.out.println((int)Math.pow(2,3));