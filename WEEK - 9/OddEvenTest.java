import java.util.*;
class OddEvenTest
{
	public static boolean isOdd(int x)
	{
		if(x%2!=0)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		boolean flag=isOdd(n);
		if(flag)
			System.out.println(n+" is an odd number");
		else
			System.out.println(n+" is an even number");
	}
}