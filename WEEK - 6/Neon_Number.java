import java.util.Scanner;
class Neon_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number*number;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			//System.out.println(sum);
			temp/=10;
		}
		if(sum==number)
			System.out.println(number+" is a Neon Number");
		else
			System.out.println(number+" is not a Neon Number");
	}
}