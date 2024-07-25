import java.util.Scanner;
class DicToBin{
    public static void main(String[] args){
	System.out.println("Enter any Dicimal Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String m = changeIt(n);
	System.out.println("Binary Number = "+m);
    }
    static String changeIt(int n)
    {
	String bin="";
	do{
	    int r = n%2;
	    bin = r + bin;
	    n=n/2;
	}while(n!=0);
    return bin;
    }
}