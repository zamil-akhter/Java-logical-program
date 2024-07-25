import java.util.*;
class Main
{
	public static void main(String args[])
	{

		//Using add() and remove()		
		ArrayList<Integer> oldroll = new ArrayList<Integer>(3);	
		oldroll.add(2000);
		oldroll.add(4000);
		oldroll.add(3000);
		oldroll.add(1000);
		oldroll.add(7000);
		oldroll.remove(0);
		System.out.println(oldroll);

		//Using set(), addAll()
		ArrayList<Integer> roll = new ArrayList<Integer>();
		roll.add(10);
		roll.add(11);
		roll.add(12);
		roll.add(13);
		roll.add(1, 20);
		roll.set(1,10);		//Update the value of 1st index with 10
		roll.addAll(0, oldroll);
		System.out.println("\nAll Rolls are \n"+roll);

		
		//Printing by using for loop and get()
		for(int i=0; i<roll.size();i++)
		{
			System.out.println("index no. "+i+" = "+roll.get(i));
		}

		//String Generic, remove() by index and value, size()
		ArrayList<String> name = new ArrayList<String>();
		name.add("Lokesh C");
		name.add("Shahid Afridi");
		name.add("Jaydeep JK");
		name.add("Yahya");
		name.add("Zamil Akhter");
		name.remove("Zamil Akhter");
		name.remove(3);
		System.out.println("\nAll Names \n"+name);
		System.out.println("\nTotal Names "+name.size());


		// Using clone(), ensureCapasity()
		ArrayList aaa = new ArrayList(5);
		aaa.ensureCapacity(20);
		aaa = (ArrayList)oldroll.clone();
		aaa.remove(1);
		System.out.println(aaa);

		//Using contains()
		boolean flag = aaa.contains(4000);
		if(flag == true)
			System.out.println("4000 is not Available");
		else
			System.out.println("4000 is Available");


		//use "indexOf()"
		ArrayList<Integer> dist = new ArrayList<Integer>(5);
		dist.add(845);
		dist.add(4236);
		dist.add(5125);
		int n = dist.indexOf(5125);
		System.out.println("index of 5152 is "+n);


		//using of "lastIndexOf()"
		ArrayList<String> familyname = new ArrayList<String>();
		familyname.add("Akhtari Begum");
		familyname.add("Faiz Ahmad Faiz");
		familyname.add("Rabeya Khatoon");
		familyname.add("Irfan Perwez");
		familyname.add("Zamil Akhter");
		familyname.add("Tanveer Azam");
		familyname.add("Zamil Akhter");
		familyname.set(1,"Faiz Ahmad");
		int li = familyname.lastIndexOf("Zamil Akhter");
		System.out.println("Last index of Zamil Akhter is "+li);
		System.out.println(familyname);


		/*
		//using removeRange() but erroe is removeRange(int,int) has protected access in ArrayList
		ArrayList<Integer> num = new ArrayList<Integer>();	
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.removeRange(1,3);
		System.out.println("After removing using removeRange "+num);
		*/


		//convert ArrayList into Array
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(5);
		arl.add(8);
		arl.add(7);
		arl.add(2);
		arl.add(5);
		System.out.println("ArrayList is "+arl);
		Object[] arr = arl.toArray();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		//using of isEmpty()
		arl.clear();  // here I removed the ArrayList 
		boolean f = arl.isEmpty();
		if(f == true)
			System.out.println("It's Empty");
		else
			System.out.println("Not Empty"); 
	}
}