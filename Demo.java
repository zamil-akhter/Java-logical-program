/*

//Inheritence Example
class Employee
{
	float sal = 40000;
}
class Programmer extends Employee
{
	int bonos = 500;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Total sal of Programmer = "+(p.sal+p.bonos));
	}
}
*/
/*


// String to Character
import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Sentence");
		String address = sc.nextLine();
		System.out.println("\nYour Address is"+address);
		char b[] = address.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}

*/
/*


//Command Line Arguments
class Demo
{
	public static void main(String[] args)
	{
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			s = s+Integer.parseInt(args[i]);
		}
		
		System.out.println(" Sum of All Numbers = "+s);	
	}
}
*/
/*



//String to Array
import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentences ");
		String str = sc.nextLine();
		System.out.println("Your given Sentence is "+str);
		char a[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] !=' ')
				count++;
		}
		System.out.println("Total Digits = "+count);
	}
}
*/
/*


//Construction Chainning
class A
{
	public A()
	{
		System.out.println("A 1");
	}
}
class B extends A 
{
	public B()
	{
		this(5,5);
		System.out.println("B 1");
	}
	public B(int b)
	{
		System.out.println("B 2");
	}
	public B(int c,int d)
	{
		System.out.println("B 3");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		B hello = new B();
	}
}
*/

/*

import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		ArrayList <Integer> arl = new ArrayList<>();

		arl.add(6);
		arl.add(12);
		arl.add(7);
		arl.add(0,23);
		for(int i=0;i<arl.size();i++)
		{
			System.out.print(arl.get(i)+" ");
		}
	}
}
*/


import java.util.*;
import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<String> input=new ArrayList<String>(20);
        String ss=sc.nextLine();
        String[] str=ss.split(",");
        for(int i=0;i<input.size();i++)
        {
            input.add(str[i]);
        }
        Arrays.sort(str);
        //int[] arr=new int[input.size()];
        for(int k=str.length-1;k>=0;k--)
        {
            System.out.print(str[k]);
            if(k==0)
            {
                System.out.println("");
            }
            else
                System.out.print(",");
        }
    }
}