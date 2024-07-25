
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int x=n,y=n,d,count=0,sum=0;
        while(x>0)
        {
            count++;
            x=x/10;
        }
        while(y>0)
        {
            d=y%10;
            sum = sum + (int)Math.pow(d,count);
            y=y/10;
        }
        if(n==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Arm");

    }
}

/*

import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
    }
}
*/