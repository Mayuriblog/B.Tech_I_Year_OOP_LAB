import java.util.Scanner;
class MagicSum
{
	public static boolean hasEight(int x)
	{
		while(x>0)
		{
			int rem=x%10;
			if(rem==8)
				return true;
			else
				x=x/10;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer (or -1 to end): ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=-1)
		{
			boolean flag=hasEight(n);
			if(flag)
			{
				sum=sum+n;
			}
			System.out.print("Enter a positive integer (or -1 to end): ");
			n=sc.nextInt();
		}
		
		System.out.println("The magic sum is : "+sum);
	}
}