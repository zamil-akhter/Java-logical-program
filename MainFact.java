class MainFact{
   public static void main(String[] args){
	int f = fact(5);
	System.out.println("Factor of 5 is "+f);
   }
   static int fact(int n)
   {
	int f = 1;
	where(n>1)
	{
	   f=f*n;
	   n--;
	}
	return f;
   }
} 