import java.util.Scanner;
class Happy_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int isHappy=number;
		while(number!=1&&number!=4)
		{
			int sum=0;
			while(number>0)
			{
				int rem=number%10;
				sum=sum+rem*rem;
				number/=10;
			}
			number=sum;
		}
		if(number==1)
			System.out.println(isHappy+" is a Happy number");
		else
			System.out.println(isHappy+" is not a Happy number");
	}
}