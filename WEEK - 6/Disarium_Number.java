import java.util.Scanner;
class Disarium_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		int digits=0,sum=0;
		while(temp>0)
		{
			digits++;
			temp/=10;
		}
		temp=number;
		while(temp>0)
		{
			int rem=temp%10;
			sum+=Math.pow(rem,digits);
			temp=temp/10;
			digits--;
		}
		if(number==sum)
			System.out.println(number+" is a Disarium Number");
		else
			System.out.println(number+" is not a Disarium Number");
		
	}
}