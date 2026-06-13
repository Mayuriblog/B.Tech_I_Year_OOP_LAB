import java.util.Scanner;
class Product1ToN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int from=1;
		int end=sc.nextInt();
		int product=1;
		for(int i=from;i<=end;i++)
		{
			product*=i;
		}
		System.out.println("product from "+from+" to "+end+" is: "+product);
	}
}