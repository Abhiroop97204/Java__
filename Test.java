import java.util.*;  
class Test
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		int min1=0;
		while(a>0)
		{
			int r=a%10;
			if(min1<r)
				min1=r;
			a=a/10;
		}
		System.out.println(min1);
		int min2=0;
		while(b>0)
		{
			int r=b%10;
			if(min2<r)
				min2=r;
			b=b/10;
		}
		System.out.println(min2);
		int min3=0;
		while(c>0)
		{
			int r=c%10;
			if(min3<r)
				min3=r;
			c=c/10;
		}
		System.out.println(min3);

	}
}