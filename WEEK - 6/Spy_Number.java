import java.util.Scanner;
class Spy_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0,product=1;
		while(number>0)
		{
			int rem=number%10;
			sum+=rem;
			product*=rem;
			number/=10;
		}
		if(sum==product)
			System.out.println(temp+" is a Spy Number");
		else
			System.out.println(temp+" is not a Spy Number");
	}
}